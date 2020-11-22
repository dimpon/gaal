package org.gaal.commonbeans.configuration;

import lombok.extern.slf4j.Slf4j;
import org.gaal.commonbeans.service.ClusterProviderImpl;
import org.gaal.services.ClusterProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
public class CommonBeansConfiguration {

    @PostConstruct
    public void post(){
        log.info("CommonBeansConfiguration is ready");
    }

    @Bean
    @Order(1000)
    @ConditionalOnMissingBean(ClusterProvider.class)
    public ClusterProvider clusterProvider(){
        log.info("Going to create create");
        return new ClusterProviderImpl();
    }

}


