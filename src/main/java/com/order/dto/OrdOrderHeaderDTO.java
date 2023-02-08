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
@EqualsAndHashCode(callSuper=false) //NOPMD
public class OrdOrderHeaderDTO {

    /**
    * serialVersionUID
    */
    private static final long serialVersionUID = 1L;


    /**
     * 关联会员体系id
     */
    private Long membershipSystemId;

    /**
     * 关联 mbr_member id
     */
    private Long mbrMemberId;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * 销售订单编号
     */
    private String orderNumber;

    /**
     * 0 未退款，1 退款退货
     */
    private Boolean returnServiceFlag;

    /**
     * 最顶级的订单号
     */
    private String originalTopOrderNumber;

    /**
     * 三方平台订单号(列如:淘宝，唯品会，凡客等等)
     */
    private String thirdOrderNumber;

    /**
     * 订单来源渠道id
     */
    private Long channelId;

    /**
     * 订单来源渠道
     */
    private String channelCode;

    /**
     * 店铺id
     */
    private Long storeId;

    /**
     * 店铺code
     */
    private String storeCode;

    /**
     * 会员姓名
     */
    private String memberName;

    /**
     * 会员号
     */
    private String memberCode;

    /**
     * 国家
     */
    private String country;

    /**
     * 省|洲
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 会员手机号
     */
    private String mobile;

    /**
     * 当前进度步骤：随配置，如1，2，3，当前所已到2
     */
    private Integer progressStep;

    /**
     * 订单时间
     */
    private LocalDateTime orderTime;

    /**
     * 订单类型:1:销售单,2 退货订单,3 发货单,4 换货单,5 采购单 6 采购退单,7 加工单
     */
    private Short orderOperatedType;

    /**
     * 订单销售类型:常规订单11,秒杀订单21,砍价订单22,订金订单23,拼团订单24,预售订单25,分销订单26,付邮申领27,赠送订单28,服务订单31,虚拟订单32
     */
    private Short orderSaledType;

    /**
     * 订单状态:1已创建 2审核通过3审核拒绝4取消
     */
    private Integer orderStatus;

    /**
     * 三方平台订单状态
     */
    private String thirdOrderStatus;

    /**
     * 希望发货时间
     */
    private LocalDateTime expectedDeliveryTime;

    /**
     * 希望到货时间
     */
    private LocalDateTime expectedArrivalTime;

    /**
     * 实际发货时间
     */
    private LocalDateTime actualDeliveryTime;

    /**
     * 实际到货时间
     */
    private LocalDateTime actualArrivalTime;

    /**
     * 付款时间
     */
    private LocalDateTime paymentTime;

    /**
     * 交易结束时间
     */
    private LocalDateTime tradeEndTime;

    /**
     * 审核模式:1无需审核自动审单 2人工审核 3工作流
     */
    private Short auditMode;

    /**
     * 审核状态:0待审核1审核通过 2审核拒绝
     */
    private Short auditStatus;

    /**
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 取消时间
     */
    private LocalDateTime cancelTime;

    /**
     * 取消原因
     */
    private String canceledReason;

    /**
     * 支付状态: 1待支付 2部分支付 3已支付 4货到付款 5无需支付
     */
    private Short paymentStatus;

    /**
     * 0 未退款,1部分退款,2全部退款,3 退款中
     */
    private Short refundStatus;

    /**
     * 配货状态：0无需配货 1未配货 2部份配货 3全部配货 ,9配货失败
     */
    private Short deliveryStatus;

    /**
     * 拆单数量,整单=1
     */
    private Integer deliveryOrderCount;

    /**
     * 发货类型:1物流配送 2到店自提 3同城配送 4无需要配送, 淘宝:11:free(卖家包邮),12 POST 平邮, 13 express 快递 ,14 ems, 15 virtua 虚拟发货,16 next_dayl次日必答, 17 BOOKING_DELIVERY  预约配送;
     */
    private Short shippingType;

    /**
     * 发货状态：0无需发货 1未发货 2部份发货 3全部发货
     */
    private Short shippingStatus;

    /**
     * 加急或延迟发货: 0未标记 1加急urgent 2延迟delay
     */
    private Short shippingSpecifiedMode;

    /**
     * 货款方向:线上支付先款后货11,线下支付21,COD普通快递货到付款31,COD特殊物流货到付款32
     */
    private Short shippingPaymentMode;

    /**
     * 需要发票标识:1是，0否
     */
    private Boolean needInvoiceFlag;

    /**
     * 订单下单留言
     */
    private String buyerMemo;

    /**
     * 卖家发货备注
     */
    private String sellerComment;

    /**
     * 商品数量
     */
    private Integer itemQuantity;

    /**
     * 商品总额
     */
    private BigDecimal productTotalAmount;

    /**
     * 促销优惠金额
     */
    private BigDecimal promotionAdjustmentTotalAmount;

    /**
     * 优惠券优惠金额
     */
    private BigDecimal couponAdjustmentTotalAmount;

    /**
     * 优惠金额
     */
    private BigDecimal adjustmentTotalAmount;

    /**
     * 应收运费
     */
    private BigDecimal originFreightFee;

    /**
     * 物流费用
     */
    private BigDecimal freightFee;

    /**
     * 应付金额
     */
    private BigDecimal paybleAmount;

    /**
     * 订单总额(实付，包括运费，已减去退款金额)
     */
    private BigDecimal orderTotalAmount;

    /**
     * 已支付总额(包括运费，未减去退款金额)
     */
    private BigDecimal payedAmount;

    /**
     * 已退款金额
     */
    private BigDecimal refundedAmount;

    /**
     * 基本状态:0Active,1Locked, 2Finish
     */
    private Short basicStatus;

    /**
     * 平台标识:平台标识:TMALL-天猫,MANUAL-手工单
     */
    private String platformSource;

    /**
     * 包装礼盒标识:1是，0否
     */
    private Boolean packingBoxFlag;

    /**
     * 包装礼盒价格
     */
    private BigDecimal packingBoxPrice;

    /**
     * 期望发货仓
     */
    private String expectedWareHouse;

    /**
     * 期望发货物流快递
     */
    private String expectedLogisticsExpress;

    /**
     * 订单处理标签
     */
    private Long orderTradingTag;

    /**
     * 下次任务执行时间
     */
    private LocalDateTime tradingNextTime;

    /**
     * 合并标记:0未合并,1可合并
     */
    private Boolean mergeFlag;

    /**
     * 卖家旗帜，0无,红-1、黄-2、绿-3、蓝-4、紫-5
     */
    private Short sellerFlag;

    /**
     * 需要计算积分的时间
     */
    private LocalDateTime pointNeedCalculateTime;

    /**
     * 是否已计算过积分：null-未计算，1-已计算
     */
    private Boolean pointCalculatedFlag;

    /**
     * 积分计算时间
     */
    private LocalDateTime pointCalculateTime;

    /**
     * 是否存在跳过计算积分的券：null-不存在，1-存在
     */
    private Boolean existSkipCalcPointCouponFlag;

    /**
     * 导购工号
     */
    private String baNo;

    /**
     * 退款单关联order_header_id
     */
    private Long relateOrderHeaderId;

    /**
     * 退款单关联销售订单编号
     */
    private String relateOrderNumber;

    /**
     * 退款单关联三方平台订单号(列如:淘宝，唯品会，凡客等等)
     */
    private String relateThirdOrderNumber;

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

    /**
     * 优惠券，json格式，数组方式
     */
    private String couponNo;

}
