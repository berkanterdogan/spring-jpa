package com.berkanterdogan.lab.springjpa.onetoone.repository;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserDetailRepository extends JpaRepository<AppUserDetail, Long> {
}
