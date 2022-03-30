package com.berkanterdogan.lab.springjpa.onetomany.domain;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    private ZonedDateTime orderDate;

    @ManyToOne(optional = false) // EAGERLY
    private Customer customer;

    public static OrderInfo createWithoutId(ZonedDateTime orderDate, Integer quantity, Customer customer) {
        return builder()
                .orderDate(orderDate)
                .quantity(quantity)
                .customer(customer)
                .build();
    }

}
