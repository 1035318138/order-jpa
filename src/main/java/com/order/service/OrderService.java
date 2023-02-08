package com.order.service;

import com.alibaba.fastjson.JSONObject;
import com.order.dao.OrderDetailRepository;
import com.order.dao.OrderHeaderRepository;
import com.order.entity.OrderDetailEntity;
import com.order.entity.OrderHeaderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Can.Ru
 */
@Service
public class OrderService {

    @Autowired
    private OrderHeaderRepository orderHeaderRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public Boolean orderCreate(String order) {
        JSONObject orderJson = JSONObject.parseObject(order);

        //数据转换
        OrderHeaderEntity orderHeaderEntity = orderHeaderConvert(orderJson);
        List<OrderDetailEntity> orderDetailList = orderDetailConvert(orderJson, orderHeaderEntity);

        //主订单入库
        orderHeaderRepository.save(orderHeaderEntity);
        orderDetailList.stream().forEach(a -> {
            a.setOrderHeaderId(orderHeaderEntity.getId());
            a.setChannelCode(orderHeaderEntity.getChannelCode());
            OrderDetailEntity.defaultValue(a);
        });

        //子订单入库
        orderDetailRepository.saveAll(orderDetailList);

        return Boolean.TRUE;
    }


    private static String MSG = "msg";
    private static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private OrderHeaderEntity orderHeaderConvert(JSONObject orderJson) {

        JSONObject msg = orderJson.getJSONObject(MSG);

        OrderHeaderEntity entity = OrderHeaderEntity.defaultEntity();

        entity.setMemberId(orderJson.getString(OrderHeaderEntity.MEMBER_ID));
        entity.setOrderPromotion(msg.getString(OrderHeaderEntity.ORDER_PROMOTION));
        entity.setAddressInfo(msg.getString(OrderHeaderEntity.ADDRESS_INFO));
        entity.setPayInfo(msg.getString(OrderHeaderEntity.PAY_INFO));
        entity.setBuyerInfo(msg.getString(OrderHeaderEntity.BUYER_INFO));
        entity.setSourceInfo(msg.getString(OrderHeaderEntity.SOURCE_INFO));
        entity.setOrderInfo(msg.getString(OrderHeaderEntity.ORDER_INFO));
        entity.setOrderNumber(orderJson.getString(OrderHeaderEntity.ORDER_NUMBER));
        entity.setChannelCode(orderJson.getString(OrderHeaderEntity.CHANNEL_CODE));
        entity.setStoreCode(orderJson.getString(OrderHeaderEntity.STORE_CODE));

        entity.setOrderTime(StringUtils.isEmpty(orderJson.getString(OrderHeaderEntity.ORDER_TIME)) ? null :
                LocalDateTime.parse(orderJson.getString(OrderHeaderEntity.ORDER_TIME), df));
        entity.setPaymentTime(StringUtils.isEmpty(orderJson.getString(OrderHeaderEntity.PAYMENT_TIME)) ? null :
                LocalDateTime.parse(orderJson.getString(OrderHeaderEntity.PAYMENT_TIME), df));

        entity.setPaymentStatus(orderJson.getString(OrderHeaderEntity.PAYMENT_STATUS));
        entity.setItemQuantity(orderJson.getInteger(OrderHeaderEntity.ITEM_QUANTITY));
        entity.setProductTotalAmount(orderJson.getBigDecimal(OrderHeaderEntity.PRODUCT_TOTAL_AMOUNT));
        entity.setPromotionAdjustmentTotalAmount(orderJson.getBigDecimal(OrderHeaderEntity.PROMOTION_ADJUSTMENT_TOTAL_AMOUNT));
        entity.setAdjustmentTotalAmount(orderJson.getBigDecimal(OrderHeaderEntity.ADJUSTMENT_TOTAL_AMOUNT));
        entity.setRefundedAmount(orderJson.getBigDecimal(OrderHeaderEntity.REFUNDED_AMOUNT));

        return entity;
    }

    private static String ORDERS = "orders";

    private List<OrderDetailEntity> orderDetailConvert(JSONObject orderJson, OrderHeaderEntity orderHeaderEntity) {

        List<OrderDetailEntity> orderDetailList = orderJson
                .getJSONObject(MSG)
                .getJSONArray(ORDERS)
                .toJavaList(OrderDetailEntity.class);
        return orderDetailList;

    }

    public OrderHeaderEntity queryOrderHeaderById(Integer id) {
        return orderHeaderRepository.findOneById(id);
    }

    public List<OrderDetailEntity> queryOrderDetailByHeaderId(Integer orderHeaderId) {
        return orderDetailRepository.findAllByOrderHeaderId(orderHeaderId);
    }

    public Page<OrderHeaderEntity> queryOrderHeaderPageList() {
        //Example 条件表达式
        //page 0是第一页 size分页单位
        //模拟分页
        return orderHeaderRepository.findAll(PageRequest.of(0, 10));
    }

    public OrderHeaderEntity queryOrderHeaderByOrderNumber(String orderNumber) {
        return orderHeaderRepository.findOneByOrderNumber(orderNumber);
    }
}
