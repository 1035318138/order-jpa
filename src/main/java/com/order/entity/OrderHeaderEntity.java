package com.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Can.Ru
 */
@Data
@Entity
@Table(name ="order_header")
public class OrderHeaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="order_promotion")
    private String orderPromotion;

    @Column(name="address_info")
    private String addressInfo;

    @Column(name="pay_info")
    private String payInfo;

    @Column(name="buyer_info")
    private String buyerInfo;

    @Column(name="source_info")
    private String sourceInfo;

    @Column(name="order_info")
    private String orderInfo;

    @Column(name="member_id")
    private String memberId;

    @Column(name="order_number")
    private String orderNumber;

    @Column(name="channel_code")
    private String channelCode;

    @Column(name="store_code")
    private String storeCode;

    @Column(name="order_time")
    private LocalDateTime orderTime;

    @Column(name="payment_time")
    private LocalDateTime paymentTime;

    @Column(name="trade_end_time")
    private LocalDateTime tradeEndTime;

    @Column(name="payment_status")
    private String paymentStatus;

    @Column(name="item_quantity")
    private Integer itemQuantity;

    @Column(name="product_total_amount")
    private BigDecimal productTotalAmount;

    @Column(name="promotion_adjustment_total_amount")
    private BigDecimal promotionAdjustmentTotalAmount;

    @Column(name="adjustment_total_amount")
    private BigDecimal adjustmentTotalAmount;

    @Column(name="refunded_amount")
    private BigDecimal refundedAmount;

    @Column(name="version")
    private Integer version;

    @Column(name="deleted")
    private Boolean deleted;

    @Column(name="create_time")
    private LocalDateTime createTime;

    @Column(name="create_userId")
    private String createUserId;

    @Column(name="update_time")
    private LocalDateTime updateTime;

    @Column(name="update_userId")
    private String updateUserId;

    public static OrderHeaderEntity defaultEntity(){
        OrderHeaderEntity entity = new OrderHeaderEntity();

        entity.setVersion(0);
        entity.setDeleted(Boolean.FALSE);

        LocalDateTime now = LocalDateTime.now();
        entity.setCreateTime(now);
        entity.setUpdateTime(now);

        entity.setCreateUserId("system");
        entity.setUpdateUserId("system");
        return entity;
    }

    public static String MEMBER_ID ="member_id";
    public static String ORDER_PROMOTION ="order_promotion";
    public static String ADDRESS_INFO ="address_info";
    public static String PAY_INFO ="pay_info";
    public static String BUYER_INFO ="buyer_info";
    public static String SOURCE_INFO ="source_info";
    public static String ORDER_INFO ="order_info";
    public static String ORDER_NUMBER ="order_number";
    public static String CHANNEL_CODE ="channel_code";
    public static String STORE_CODE ="store_code";
    public static String ORDER_TIME ="order_time";
    public static String PAYMENT_TIME ="payment_time";
    public static String TRADE_END_TIME ="trade_end_time";
    public static String PAYMENT_STATUS ="payment_status";
    public static String ITEM_QUANTITY ="item_quantity";
    public static String PRODUCT_TOTAL_AMOUNT ="product_total_amount";
    public static String PROMOTION_ADJUSTMENT_TOTAL_AMOUNT ="promotion_adjustment_total_amount";
    public static String ADJUSTMENT_TOTAL_AMOUNT ="adjustment_total_amount";
    public static String REFUNDED_AMOUNT ="refunded_amount";
}
