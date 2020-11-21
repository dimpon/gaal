package org.gaal.application;

import lombok.extern.slf4j.Slf4j;
import org.gaal.dto.ClusterDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Slf4j
@SpringBootApplication
public class GaalApplication {

    @Value("${module-one.enable}")
    private Boolean module1;

    @PostConstruct
    public void post(){
        log.info("module-one.enable: {}",module1);
    }

    public static void main(String[] args) {


        org.gaal.dto.ClusterDTO d = new ClusterDTO("cluster1", LocalDate.now());
        log.info("cluster {}", d);

        SpringApplication.run(GaalApplication.class, args);

        //com.fasterxml.jackson.annotation.JsonProperty g;
    }
}