package com.berkanterdogan.lab.springjpa.onetomany.service.impl;

import com.berkanterdogan.lab.springjpa.onetomany.domain.Customer;
import com.berkanterdogan.lab.springjpa.onetomany.repository.CustomerRepository;
import com.berkanterdogan.lab.springjpa.onetomany.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional
    public void deleteAll() {
        customerRepository.deleteAll();
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}
