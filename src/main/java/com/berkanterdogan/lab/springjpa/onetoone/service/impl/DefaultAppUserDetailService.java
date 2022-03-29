package com.berkanterdogan.lab.springjpa.onetoone.service.impl;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUserDetail;
import com.berkanterdogan.lab.springjpa.onetoone.repository.AppUserDetailRepository;
import com.berkanterdogan.lab.springjpa.onetoone.service.AppUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultAppUserDetailService implements AppUserDetailService {

    private final AppUserDetailRepository appUserDetailRepository;

    @Override
    @Transactional
    public void deleteAll() {
        appUserDetailRepository.deleteAll();
    }

    @Override
    @Transactional
    public AppUserDetail save(AppUserDetail appUserDetail) {
        return appUserDetailRepository.save(appUserDetail);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AppUserDetail> findAll() {
        return appUserDetailRepository.findAll();
    }
}
