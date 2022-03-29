package com.berkanterdogan.lab.springjpa.onetoone.service.impl;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUserDetail;
import com.berkanterdogan.lab.springjpa.onetoone.repository.AppUserDetailRepository;
import com.berkanterdogan.lab.springjpa.onetoone.service.AppUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultAppUserDetailService implements AppUserDetailService {

    private final AppUserDetailRepository appUserDetailRepository;

    @Override
    public void deleteAll() {
        appUserDetailRepository.deleteAll();
    }

    @Override
    public AppUserDetail save(AppUserDetail appUserDetail) {
        return appUserDetailRepository.save(appUserDetail);
    }

    @Override
    public AppUserDetail findById(Long id) {
        return appUserDetailRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<AppUserDetail> findAll() {
        return appUserDetailRepository.findAll();
    }
}
