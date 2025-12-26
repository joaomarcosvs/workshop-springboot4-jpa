package com.estudobetha.course.config;

import com.estudobetha.course.entities.User;
import com.estudobetha.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Luiza", "luiza@gmail.com", "999999999", "123456");
        User u2 = new User(null, "Joao M", "joaom@gmail.com", "888888888", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
