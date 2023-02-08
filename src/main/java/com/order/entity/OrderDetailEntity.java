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
@Table(name ="order_detail")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="order_header_id")
    private Integer orderHeaderId;

    @Column(name="member_id")
    private String memberId;

    @Column(name="third_order_number")
    private String thirdOrderNumber;

    @Column(name="sku_id")
    private String skuId;

    @Column(name="channel_code")
    private String channelCode;

    @Column(name="sub_order_number")
    private String subOrderNumber;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_size")
    private String itemSize;

    @Column(name="item_quantity")
    private Integer itemQuantity;

    @Column(name="item_adjustment_total_price")
    private BigDecimal itemAdjustmentTotalPrice;

    @Column(name="item_sale_price")
    private BigDecimal itemSalePrice;

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

    public static OrderDetailEntity defaultEntity(){
        OrderDetailEntity entity = new OrderDetailEntity();

        entity.setVersion(0);
        entity.setDeleted(Boolean.FALSE);

        LocalDateTime now = LocalDateTime.now();
        entity.setCreateTime(now);
        entity.setUpdateTime(now);

        entity.setCreateUserId("system");
        entity.setUpdateUserId("system");
        return entity;
    }

    public static void defaultValue(OrderDetailEntity entity){

        entity.setVersion(0);
        entity.setDeleted(Boolean.FALSE);

        LocalDateTime now = LocalDateTime.now();
        entity.setCreateTime(now);
        entity.setUpdateTime(now);

        entity.setCreateUserId("system");
        entity.setUpdateUserId("system");
    }

    public static String ORDER_HEADER_ID ="order_header_id";
    public static String MEMBER_ID ="member_id";
    public static String THIRD_ORDER_NUMBER ="third_order_number";
    public static String SKU_ID ="sku_id";
    public static String CHANNEL_CODE ="channel_code";
    public static String SUB_ORDER_NUMBER ="sub_order_number";
    public static String ITEM_NAME ="item_name";
    public static String ITEM_SIZE ="item_size";
    public static String ITEM_QUANTITY ="item_quantity";
    public static String ITEM_ADJUSTMENT_TOTAL_PRICE ="item_adjustment_total_price";
    public static String ITEM_SALE_PRICE ="item_sale_price";

}
