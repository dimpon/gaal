package org.gaal.moduleone.configuration;

import lombok.extern.slf4j.Slf4j;
import org.gaal.moduleone.service.ModuleOneService;
import org.gaal.moduleone.service.ModuleOneServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Slf4j
@ConditionalOnProperty(prefix = "module-one", name = "enable", havingValue = "true")
@Configuration
@ComponentScan(basePackages = {"org.gaal.moduleone.controller"})
public class ModuleOneConfiguration {

    @PostConstruct
    public void post(){
        log.info("ModuleOneConfiguration is ready");
    }

    @Bean
    public ModuleOneService getOne(){
        log.info("Going to create ModuleOneService");
        return new ModuleOneServiceImpl();
    }

}


