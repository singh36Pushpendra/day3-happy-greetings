package com.app.greetings.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getHello() {
        return "Hello World!!!";
    }
}
