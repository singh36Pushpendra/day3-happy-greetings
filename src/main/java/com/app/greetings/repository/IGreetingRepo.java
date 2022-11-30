package com.app.greetings.repository;

import com.app.greetings.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGreetingRepo extends JpaRepository<User, Integer> {
}
