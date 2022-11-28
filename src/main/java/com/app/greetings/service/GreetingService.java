package com.app.greetings.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public static String getGreet() {
        return "Hello World";
    }
}
