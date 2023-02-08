package com.order.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author auto generator
 */
@Data //NOPMD
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) //NOPMD
public class OrdOrderDetailDTO implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;


    /**
     * 关联会员体系id
     */
    private Long membershipSystemId;

    /**
     * 关联 ord_order_header id
     */
    private Long ordOrderHeaderId;

    /**
     * 关联 mbr_member id
     */
    private Long mbrMemberId;

    /**
     * 关联 mst_sku id
     */
    private Long mstSkuId;

    /**
     * 三方平台订单号
     */
    private String thirdOrderNumber;

    /**
     * 订单来源渠道
     */
    private String channelCode;

    /**
     * 明细单号
     */
    private String subOrderNumber;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 商品代码
     */
    private String itemProductCode;

    /**
     * sku编码
     */
    private String itemSkuCode;

    /**
     * 商品类型
     */
    private String itemCategory;

    /**
     * (商品sku规格)规格名称
     */
    private String itemSize;

    /**
     * (网店销售单价)销售单价
     */
    private BigDecimal itemSalePrice;

    /**
     * 商品优惠单价
     */
    private BigDecimal itemAdjustmentUnitPrice;

    /**
     * 商品数量
     */
    private Integer itemQuantity;

    /**
     * (已发货数量)配货数量
     */
    private Integer deliveriedQuantity;

    /**
     * 发货状态：0无需发货 待发货1，部份发货2，已发货3
     */
    private Short deliveryStatus;

    /**
     * 实付金额(如果是退款单，则为退款金额)
     */
    private BigDecimal itemAdjustmentTotalPrice;

    /**
     * 三方退款单号
     */
    private String thirdRefundId;

    /**
     * 退款单关联三方明细单号
     */
    private String refSubOrderNumber;

    /**
     * 是否存在异常：1-存在异常
     */
    private Boolean existExceptionFlag;

    /**
     * 显示顺序
     */
    private Integer sortId;

    /**
     * 创建用户名
     */
    private String createUserName;

    /**
     * 更新用户名
     */
    private String updateUserName;


    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Boolean deleted;
    private String createUserId;
    private String updateUserId;
    private Integer version;
    private Long partnerId;

}
