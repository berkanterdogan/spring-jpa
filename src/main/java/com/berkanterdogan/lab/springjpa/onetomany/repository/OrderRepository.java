package com.berkanterdogan.lab.springjpa.onetomany.repository;

import com.berkanterdogan.lab.springjpa.onetomany.domain.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderInfo, Long> {
}
