package org.gaal.modulethree.controller;

import lombok.extern.slf4j.Slf4j;

import org.gaal.events.EventType;
import org.gaal.events.GenericEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.PostConstruct;

@Controller
@Slf4j
public class WebController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    @PostConstruct
    public void post() {
        log.info("WebController is ready");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {

        log.info("open index");
        return "index";
    }

    @RequestMapping(value = "service1", method = RequestMethod.POST)
    public String service1(Model model) {

        log.info("call service1");
        var event = GenericEvent.of("Job1234", EventType.INTERRUPT_JOB);
        log.info("fire event {}", event);
        applicationEventPublisher.publishEvent(event);
        return "index";
    }

}
