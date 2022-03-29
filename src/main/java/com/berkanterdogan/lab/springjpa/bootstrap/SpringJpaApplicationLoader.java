package com.berkanterdogan.lab.springjpa.bootstrap;

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
        // TODO @berkanterdogan - implement
    }

    private void runManyToManyExample() {
        log.info("ManyToManyExampleService is running....");
        // TODO @berkanterdogan - implement
    }

}
