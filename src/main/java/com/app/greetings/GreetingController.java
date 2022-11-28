package com.app.greetings;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/happy")
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestBody String msg) {
        return msg;
    }
}
