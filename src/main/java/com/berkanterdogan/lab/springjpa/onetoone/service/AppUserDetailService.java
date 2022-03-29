package com.berkanterdogan.lab.springjpa.onetoone.service;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUserDetail;

import java.util.List;

public interface AppUserDetailService {

    void deleteAll();

    AppUserDetail save(AppUserDetail appUserDetail);

    List<AppUserDetail> findAll();
}
