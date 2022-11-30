package com.app.greetings.service;

import com.app.greetings.model.User;
import com.app.greetings.repository.IGreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    IGreetingRepo repo;

    public String getHello() {
        return "Hello World!!!";
    }

    public String add(User user) {
        User savedUser = repo.save(user);
        return "Hello " + savedUser.getFirstName() + " " + savedUser.getLastName();
    }
}
