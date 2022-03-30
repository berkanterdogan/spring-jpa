package com.berkanterdogan.lab.springjpa.bootstrap;

import com.berkanterdogan.lab.springjpa.onetomany.service.OneToManyExampleService;
import com.berkanterdogan.lab.springjpa.onetoone.service.OneToOneExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class SpringJpaApplicationLoader implements CommandLineRunner {

    private final OneToOneExampleService oneToOneExampleService;
    private final OneToManyExampleService oneToManyExampleService;

    @Override
    public void run(String... args) throws Exception {
        runOneToOneExample();
        runOneToManyExample();
        runManyToManyExample();
    }

    private void runOneToOneExample() {
        log.info("OneToOneExampleService is running....");
        oneToOneExampleService.deleteAllData();
        oneToOneExampleService.saveData();
        oneToOneExampleService.queryAppUser();
        oneToOneExampleService.queryAppUserDetail();
    }

    private void runOneToManyExample() {
        log.info("OneToManyExampleService is running....");
        oneToManyExampleService.deleteAllData();
        oneToManyExampleService.saveData();
        oneToManyExampleService.queryCustomer();
        oneToManyExampleService.queryOrder();
    }

    private void runManyToManyExample() {
        log.info("ManyToManyExampleService is running....");
        // TODO @berkanterdogan - implement
    }

}
