package com.app.greetings.service;

import com.app.greetings.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getHello() {
        return "Hello World!!!";
    }

    public String getGreet(User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}
