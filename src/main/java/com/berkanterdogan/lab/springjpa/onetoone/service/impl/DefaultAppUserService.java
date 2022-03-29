package com.berkanterdogan.lab.springjpa.onetoone.service.impl;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUser;
import com.berkanterdogan.lab.springjpa.onetoone.repository.AppUserRepository;
import com.berkanterdogan.lab.springjpa.onetoone.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultAppUserService implements AppUserService {

    private final AppUserRepository appUserRepository;

    @Override
    public void deleteAll() {
        appUserRepository.deleteAll();
    }

    @Override
    public AppUser save(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser findById(Long id) {
        return appUserRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<AppUser> findAll() {
        return appUserRepository.findAll();
    }


}
