package com.app.greetings.controller;

import com.app.greetings.model.User;
import com.app.greetings.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/postgreet")
    public String greeting(@RequestBody User user) {
        return service.add(user);
    }

    @GetMapping("/getgreet")
    public String greeting(@RequestParam int id) {
        return service.get(id);
    }

    @GetMapping("/greetlist")
    public List<String> greeting() {
        return service.getList();
    }
}
