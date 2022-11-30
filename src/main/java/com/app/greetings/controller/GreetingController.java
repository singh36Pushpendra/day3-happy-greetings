package com.app.greetings.controller;

import com.app.greetings.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/happy")
public class GreetingController {

    @Autowired
    GreetingService service;

    @RequestMapping("/greeting")
    public String greeting(@RequestBody String msg) {
        return msg;
    }

    @GetMapping("/gethello")
    public String hello() {
        return service.getHello();
    }
}
