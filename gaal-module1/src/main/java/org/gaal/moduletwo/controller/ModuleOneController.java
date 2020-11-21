package org.gaal.moduletwo.controller;

import lombok.extern.slf4j.Slf4j;
import org.gaal.dto.ClusterDTO;
import org.gaal.moduletwo.service.ModuleOneService;
import org.gaal.valueobjects.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostConstruct
    public void post() {
        log.info("ModuleOneController is ready");
    }

    @RequestMapping(value = "/cluster", method = RequestMethod.GET)
    public ClusterDTO health() {

        return moduleOneService.cluster().dto();
    }

}
