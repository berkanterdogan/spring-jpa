package com.berkanterdogan.lab.springjpa.onetomany.service;

import com.berkanterdogan.lab.springjpa.onetomany.domain.OrderInfo;

import java.util.List;

public interface OrderService {

    void deleteAll();

    OrderInfo save(OrderInfo orderInfo);

    List<OrderInfo> findAll();
}
