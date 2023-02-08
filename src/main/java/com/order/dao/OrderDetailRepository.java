package com.order.dao;

import com.order.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Can.Ru
 */

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity,Integer> {
    /**
     * 根据主单id查询子单
     * @param orderHeaderId
     * @return
     */
    List<OrderDetailEntity> findAllByOrderHeaderId(Integer orderHeaderId);
}
