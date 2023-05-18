package com.springBootRelations.OneToMany.controller;

import com.springBootRelations.OneToMany.entity.Order;
import com.springBootRelations.OneToMany.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private  OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }
    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }
    public Order getOrder(@PathVariable Long orderId){
        return orderRepository.findById(orderId)
                .orElseThrow(()->new NoSuchElementException("Order Not Found"));
    }

}
