package com.berkanterdogan.lab.springjpa.onetomany.service.impl;

import com.berkanterdogan.lab.springjpa.onetomany.domain.OrderInfo;
import com.berkanterdogan.lab.springjpa.onetomany.repository.OrderRepository;
import com.berkanterdogan.lab.springjpa.onetomany.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultOrderService implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    @Transactional
    public void deleteAll() {
        orderRepository.deleteAll();
    }

    @Override
    @Transactional
    public OrderInfo save(OrderInfo orderInfo) {
        return orderRepository.save(orderInfo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<OrderInfo> findAll() {
        return orderRepository.findAll();
    }


}
