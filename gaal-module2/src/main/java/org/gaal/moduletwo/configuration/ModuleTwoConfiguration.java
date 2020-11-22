package org.gaal.moduletwo.configuration;

import lombok.extern.slf4j.Slf4j;
import org.gaal.moduletwo.service.ModuleTwoService;
import org.gaal.moduletwo.service.ModuleTwoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Slf4j
@ConditionalOnProperty(prefix = "module-two", name = "enable", havingValue = "true")
@Configuration
@ComponentScan(basePackages = {"org.gaal.moduletwo.controller"})
public class ModuleTwoConfiguration {

    @PostConstruct
    public void post(){
        log.info("ModuleTwoConfiguration is ready");
    }

    @Bean
    public ModuleTwoService getTwo(){
        log.info("Going to create ModuleTwoService");
        return new ModuleTwoServiceImpl();
    }

}


