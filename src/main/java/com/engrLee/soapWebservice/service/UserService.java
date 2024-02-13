package com.engrLee.soapWebservice.service;

import com.engrLee.soapWebservice.data.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialise() {
        User Liberty = new User();
        Liberty.setName("Liberty");
        Liberty.setAge(30);
        Liberty.setEmail("libertyimobi@gmail.com");
        Liberty.setSalary(350000.00);
        Liberty.setPhoneNumber("07089611236");
        Liberty.setAddress("Lagos, Nigeria");

        User james = new User();
        james.setName("James");
        james.setAge(26);
        james.setEmail("james@gmail.com");
        james.setSalary(8934.00);
        james.setPhoneNumber("07898765438");
        james.setAddress("at test address 5");

        users.put(Liberty.getName(), Liberty);
        users.put(james.getName(), james);

    }

    public User getUsers(String name) {
        return users.get(name);
    }
}
