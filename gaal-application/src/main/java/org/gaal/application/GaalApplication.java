package org.gaal.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


import javax.annotation.PostConstruct;

@Slf4j
@EnableAutoConfiguration
public class GaalApplication {

    @Value("${module-one.enable}")
    private Boolean module1;

    @Value("${module-two.enable}")
    private Boolean module2;

    @Value("${module-three.enable}")
    private Boolean module3;

    @PostConstruct
    public void post() {
        log.info("module-one.enable: {}", module1);
        log.info("module-two.enable: {}", module2);
        log.info("module-three.enable: {}", module3);
    }

    public static void main(String[] args) {
        SpringApplication.run(GaalApplication.class, args);
    }
}