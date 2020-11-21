package org.gaal.moduletwo.controller;

import lombok.extern.slf4j.Slf4j;
import org.gaal.moduletwo.service.ModuleTwoService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostConstruct
    public void post(){
      log.info("ModuleOneController is ready");
    }

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health(){
        return moduleTwoService.health();
    }

}
