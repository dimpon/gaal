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
@ConditionalOnProperty(prefix = "module-one", name = "enable", havingValue = "true")
@Configuration
@ComponentScan(basePackages = { "org.gaal.moduleone.controller"})
public class ModuleTwoConfiguration {

    @PostConstruct
    public void post(){
        log.info("ModuleOneConfiguration is ready");
    }

    @Bean
    public ModuleTwoService get(){
        log.info("Going to create ModuleOneService");
        return new ModuleTwoServiceImpl();
    }

}


