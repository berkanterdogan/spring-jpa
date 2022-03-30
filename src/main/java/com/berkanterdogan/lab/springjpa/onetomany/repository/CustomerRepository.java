package com.berkanterdogan.lab.springjpa.onetomany.repository;

import com.berkanterdogan.lab.springjpa.onetomany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
