package org.gaal.modulethree.configuration;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Slf4j
@ConditionalOnProperty(prefix = "module-three", name = "enable", havingValue = "true")
@Configuration
@ComponentScan(basePackages = { "org.gaal.modulethree.controller"})
public class ModuleThreeConfiguration {

    @PostConstruct
    public void post(){
        log.info("ModuleThreeConfiguration is ready");
    }



}


