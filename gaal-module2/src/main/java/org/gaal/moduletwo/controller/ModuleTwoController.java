package org.gaal.moduletwo.controller;

import lombok.extern.slf4j.Slf4j;
import org.gaal.dto.ClusterDTO;
import org.gaal.events.GenericEvent;
import org.gaal.moduletwo.service.ModuleTwoService;
import org.gaal.services.ClusterProvider;
import org.gaal.valueobjects.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/module-two")
public class ModuleTwoController {

    @Autowired
    private ModuleTwoService moduleTwoService;

    @Autowired
    private ClusterProvider clusterProvider;

    @PostConstruct
    public void post(){
      log.info("ModuleTwoController is ready");
    }

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health(){
        return moduleTwoService.health();
    }


    @RequestMapping(value = "/cluster", method = RequestMethod.GET)
    public ClusterDTO cluster(){
        return clusterProvider.createNewCluster("xxx").dto();
    }

    @EventListener(value = GenericEvent.class, condition = "#event.type == T(org.gaal.events.EventType).INTERRUPT_JOB")
    public void interrupt(GenericEvent<String> event) {
        log.info("caught event {}", event);
    }

}
