package org.gaal.moduletwo.controller;

import lombok.extern.slf4j.Slf4j;
import org.gaal.moduletwo.service.ModuleOneService;
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
    public void post(){
      log.info("ModuleOneController is ready");
    }

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health(){
        return moduleOneService.health();
    }

}
