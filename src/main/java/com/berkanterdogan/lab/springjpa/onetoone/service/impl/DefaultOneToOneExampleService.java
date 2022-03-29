package com.berkanterdogan.lab.springjpa.onetoone.service.impl;

import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUser;
import com.berkanterdogan.lab.springjpa.onetoone.domain.AppUserDetail;
import com.berkanterdogan.lab.springjpa.onetoone.service.AppUserDetailService;
import com.berkanterdogan.lab.springjpa.onetoone.service.AppUserService;
import com.berkanterdogan.lab.springjpa.onetoone.service.OneToOneExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DefaultOneToOneExampleService implements OneToOneExampleService {

    private final AppUserService userService;
    private final AppUserDetailService userDetailService;

    @Override
    @Transactional
    public void deleteAllData() {
        log.info("Deleting all data....");
        userDetailService.deleteAll();
        userService.deleteAll();
    }

    @Override
    @Transactional
    public void saveData() {
        log.info("Saving data....");
        AppUser appUser1 = AppUser.createWithoutId("name1", "email1", "password1");
        userService.save(appUser1);

        AppUser appUser2 = AppUser.createWithoutId("name2", "email2", "password2");
        userService.save(appUser2);

        AppUserDetail appUserDetail1 = AppUserDetail.createWithoutId(AppUserDetail.Gender.MALE, "1111111111",
                "city1", "country1", appUser1);
        userDetailService.save(appUserDetail1);

        AppUserDetail appUserDetail2 = AppUserDetail.createWithoutId(AppUserDetail.Gender.MALE, "2222222222",
                "city2", "country2", appUser2);
        userDetailService.save(appUserDetail2);
    }

    @Override
    @Transactional(readOnly = true)
    public void queryAppUser() {
        log.info("appUserService.findAll - FETCH objects of AppUserDetail EAGERLY: ");
        List<AppUser> appUsers = userService.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void queryAppUserDetail() {
        log.info("appUserServiceDetailService.findAll - LAZY - FETCH objects of AppUser LAZY: ");
        List<AppUserDetail> appUserDetails = userDetailService.findAll();
        log.info("appUserServiceDetailService.findAll - LAZY - appUserDetails.get(0).getAppUser() is fetching...");
        appUserDetails.get(0).getAppUser().getName();
    }
}
