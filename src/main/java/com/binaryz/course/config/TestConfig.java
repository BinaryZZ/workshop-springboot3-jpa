package com.binaryz.course.config;


import com.binaryz.course.entities.User;
import com.binaryz.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { //implementation to use CommandLineRunner methods

    @Autowired
    private UserRepository userRepository; // dependency injection


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "119999999999", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "119999999999", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
