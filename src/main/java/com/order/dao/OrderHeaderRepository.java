package com.order.dao;

import com.order.entity.OrderHeaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Can.Ru
 */

public interface OrderHeaderRepository extends JpaRepository<OrderHeaderEntity,Integer> {

    /**
     * 根据主键id查询订单头
     * @param id
     * @return
     */
    OrderHeaderEntity findOneById(Integer id);

    /**
     * 根据订单号查询订单
     * @param orderNumber
     * @return
     */
    OrderHeaderEntity findOneByOrderNumber(String orderNumber);
}
