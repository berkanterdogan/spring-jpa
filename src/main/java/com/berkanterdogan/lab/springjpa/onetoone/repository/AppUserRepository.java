package com.berkanterdogan.lab.springjpa.onetoone.repository;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
