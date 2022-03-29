package com.berkanterdogan.lab.springjpa.onetoone.service;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUser;

import java.util.List;

public interface AppUserService {
    void deleteAll();

    AppUser save(AppUser appUser);

    AppUser findById(Long id);

    List<AppUser> findAll();
}
