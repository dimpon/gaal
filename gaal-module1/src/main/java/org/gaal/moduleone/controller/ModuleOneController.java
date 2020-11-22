package org.gaal.moduleone.controller;

import lombok.extern.slf4j.Slf4j;
import org.gaal.dto.ClusterDTO;
import org.gaal.events.GenericEvent;
import org.gaal.moduleone.service.ModuleOneService;
import org.gaal.services.ClusterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/module-one")
public class ModuleOneController {

    @Autowired
    private ModuleOneService moduleOneService;

    @Autowired
    private ClusterProvider clusterProvider;

    @PostConstruct
    public void post() {
        log.info("ModuleOneController is ready");
    }

    @RequestMapping(value = "/cluster2", method = RequestMethod.GET)
    public ClusterDTO cluster2() {
        log.info("cluster2");
        return moduleOneService.cluster().dto();
    }

    @RequestMapping(value = "/cluster1/{name}", method = RequestMethod.GET)
    public ClusterDTO cluster1(@PathVariable("name") String name) {
        log.info("cluster1 {}", name);
        return clusterProvider.createNewCluster(name).dto();
    }

    @EventListener(value = GenericEvent.class, condition = "#event.type == T(org.gaal.events.EventType).INTERRUPT_JOB")
    public void interrupt(GenericEvent<String> event) {
        log.info("caught event {}", event);
    }

}
