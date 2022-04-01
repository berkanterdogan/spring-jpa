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
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER) // EAGERLY
    private List<Student> students;

    public static Course createWithoutId(String name, List<Student> students) {
        return builder()
                .name(name)
                .students(students)
                .build();
    }

}
