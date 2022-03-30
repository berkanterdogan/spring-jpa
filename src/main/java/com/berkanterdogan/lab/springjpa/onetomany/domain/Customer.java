package com.berkanterdogan.lab.springjpa.onetomany.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "customer") // LAZY
    private List<OrderInfo> orderInfos;

    public static Customer createWithoutId(String name) {
        return builder()
                .name(name)
                .build();
    }

}
