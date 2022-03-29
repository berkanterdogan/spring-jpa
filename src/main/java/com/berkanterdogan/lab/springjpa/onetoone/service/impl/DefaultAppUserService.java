package com.berkanterdogan.lab.springjpa.onetoone.service.impl;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUser;
import com.berkanterdogan.lab.springjpa.onetoone.repository.AppUserRepository;
import com.berkanterdogan.lab.springjpa.onetoone.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultAppUserService implements AppUserService {

    private final AppUserRepository appUserRepository;

    @Override
    @Transactional
    public void deleteAll() {
        appUserRepository.deleteAll();
    }

    @Override
    @Transactional
    public AppUser save(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AppUser> findAll() {
        return appUserRepository.findAll();
    }


}
