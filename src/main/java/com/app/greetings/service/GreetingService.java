package com.app.greetings.service;

import com.app.greetings.model.User;
import com.app.greetings.repository.IGreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public String get(int id) {
        Optional<User> userOptional = repo.findById(id);
        User user = userOptional.get();
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

    public List<String> getList() {
        List<User> allUser = repo.findAll();
        List<String> greetings = allUser.stream()
                .map(user -> "Hello " + user.getFirstName() + " " + user.getLastName())
                .collect(Collectors.toList());

        return greetings;

    }

    public User update(int id, User user) {
        Optional<User> optionalUser = repo.findById(id);
        optionalUser.get().setFirstName(user.getFirstName());
        optionalUser.get().setLastName(user.getLastName());
        User updatedUser = repo.save(optionalUser.get());
        return updatedUser;
    }
}
