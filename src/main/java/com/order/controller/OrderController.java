package com.order.controller;


import com.order.entity.OrderDetailEntity;
import com.order.entity.OrderHeaderEntity;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Can.Ru
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderCreate")
    public Boolean orderCreate(@RequestBody String order){
        return orderService.orderCreate(order);
    }

    @GetMapping("/queryOrderHeaderById")
    public OrderHeaderEntity queryOrderHeader(@RequestParam Integer id){
        return orderService.queryOrderHeaderById(id);
    }

    @GetMapping("/queryOrderDetailByHeaderId")
    public List<OrderDetailEntity> queryOrderDetailByHeaderId(@RequestParam Integer orderHeaderId){
        return orderService.queryOrderDetailByHeaderId(orderHeaderId);
    }

    @GetMapping("/queryOrderHeaderPageList")
    public Page<OrderHeaderEntity> queryOrderHeaderPageList(){
        return orderService.queryOrderHeaderPageList();
    }

    @GetMapping("/queryOrderHeaderByOrderNumber")
    public OrderHeaderEntity queryOrderHeaderByOrderNumber(@RequestParam String orderNumber){
        return orderService.queryOrderHeaderByOrderNumber(orderNumber);
    }

}
