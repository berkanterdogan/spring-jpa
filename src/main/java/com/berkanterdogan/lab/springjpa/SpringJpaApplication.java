package com.berkanterdogan.lab.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({
        "com.berkanterdogan.lab.springjpa.onetoone.domain",
        "com.berkanterdogan.lab.springjpa.onetomany.domain",
        "com.berkanterdogan.lab.springjpa.manytomany.domain"
})
@EnableJpaRepositories(basePackages = {
        "com.berkanterdogan.lab.springjpa.onetoone.repository",
        "com.berkanterdogan.lab.springjpa.onetomany.repository",
        "com.berkanterdogan.lab.springjpa.manytomany.repository"
})
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

}
