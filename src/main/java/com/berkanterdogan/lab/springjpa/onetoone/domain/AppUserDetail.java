package com.berkanterdogan.lab.springjpa.onetoone.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AppUserDetail {

    @Getter
    public enum Gender {
        FEMALE,
        MALE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private String phoneNumber;
    private String city;
    private String country;

    @OneToOne(optional = false, fetch = FetchType.LAZY) // LAZY
    private AppUser appUser;

    public static AppUserDetail createWithoutId(Gender gender, String phoneNumber, String city,
                                                String country, AppUser appUser) {
        return builder()
                .gender(gender)
                .phoneNumber(phoneNumber)
                .city(city)
                .country(country)
                .appUser(appUser)
                .build();
    }
}
