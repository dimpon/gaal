package org.gaal.moduletwo.configuration;

import lombok.extern.slf4j.Slf4j;
import org.gaal.moduletwo.service.ClusterProviderTwo;
import org.gaal.moduletwo.service.ModuleTwoService;
import org.gaal.moduletwo.service.ModuleTwoServiceImpl;
import org.gaal.services.ClusterProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

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


    //it can overlap bean from gaal-common-bean
    /*@Order(1)
    @Bean
    public ClusterProvider clusterProviderTwo(){
        log.info("Going to create ClusterProviderTwo");
        return new ClusterProviderTwo();
    }*/

}


