package com.berkanterdogan.lab.springjpa.onetomany.service.impl;

import com.berkanterdogan.lab.springjpa.onetomany.domain.Customer;
import com.berkanterdogan.lab.springjpa.onetomany.domain.OrderInfo;
import com.berkanterdogan.lab.springjpa.onetomany.service.CustomerService;
import com.berkanterdogan.lab.springjpa.onetomany.service.OneToManyExampleService;
import com.berkanterdogan.lab.springjpa.onetomany.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DefaultOneToManyExampleService implements OneToManyExampleService {

    private final CustomerService customerService;
    private final OrderService orderService;

    @Override
    @Transactional
    public void deleteAllData() {
        log.info("Deleting all data....");
        orderService.deleteAll();
        customerService.deleteAll();
    }

    @Override
    @Transactional
    public void saveData() {
        log.info("Saving data....");
        Customer customer1 = Customer.createWithoutId("customer1");
        customerService.save(customer1);

        OrderInfo orderInfo1 = OrderInfo.createWithoutId(ZonedDateTime.now(), 1, customer1);
        orderService.save(orderInfo1);

        OrderInfo orderInfo2 = OrderInfo.createWithoutId(ZonedDateTime.now(), 2, customer1);
        orderService.save(orderInfo2);

        Customer customer2 = Customer.createWithoutId("customer2");
        customerService.save(customer2);

        OrderInfo orderInfo3 = OrderInfo.createWithoutId(ZonedDateTime.now(), 3, customer2);
        orderService.save(orderInfo3);

        OrderInfo orderInfo4 = OrderInfo.createWithoutId(ZonedDateTime.now(), 4, customer2);
        orderService.save(orderInfo4);

        OrderInfo orderInfo5 = OrderInfo.createWithoutId(ZonedDateTime.now(), 5, customer2);
        orderService.save(orderInfo5);
    }

    @Override
    @Transactional(readOnly = true)
    public void queryCustomer() {
        log.info("customerService.findAll - FETCH objects of Customer LAZY: ");
        List<Customer> customers = customerService.findAll();
        log.info("customerService.findAll - customers.get(0).getOrderInfos().get(0) is fetching now...");
        customers.get(0).getOrderInfos().get(0);
    }

    @Override
    @Transactional(readOnly = true)
    public void queryOrder() {
        log.info("orderService.findAll - FETCH objects of OrderInfo EAGERLY: ");
        List<OrderInfo> orderInfos = orderService.findAll();
    }
}
