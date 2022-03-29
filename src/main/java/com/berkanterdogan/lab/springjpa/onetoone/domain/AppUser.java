package com.berkanterdogan.lab.springjpa.onetoone.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @OneToOne(mappedBy = "appUser")
    private AppUserDetail userDetail;

    public static AppUser createWithoutId(String name, String email, String password) {
        return builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
    }

}
