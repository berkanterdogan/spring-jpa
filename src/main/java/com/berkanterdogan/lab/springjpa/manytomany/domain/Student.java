package com.berkanterdogan.lab.springjpa.manytomany.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "students") // LAZY
    private List<Course> courses;

    public static Student createWithoutId(String firstName, String lastName) {
        return builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }

}
