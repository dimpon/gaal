package org.gaal.modulethree.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.PostConstruct;

@Controller
@Slf4j
public class WebController {


    @PostConstruct
    public void post(){
      log.info("WebController is ready");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {

        log.info("open index");
        return "index";
    }

}
