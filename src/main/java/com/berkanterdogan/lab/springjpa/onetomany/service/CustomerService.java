package com.berkanterdogan.lab.springjpa.onetomany.service;

import com.berkanterdogan.lab.springjpa.onetomany.domain.Customer;

import java.util.List;

public interface CustomerService {

    void deleteAll();

    Customer save(Customer customer);

    List<Customer> findAll();
}
