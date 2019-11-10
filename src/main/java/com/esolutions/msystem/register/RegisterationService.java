package com.esolutions.msystem.register;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RegisterationService {

    private List<User> usersMock = Arrays.asList(new User("1", "Ahmed", "123", User.UserType.Doctor),
            new User("2", "Adel", "123", User.UserType.Doctor),
            new User("3", "Samah", "123", User.UserType.Patient),
            new User("4", "Barcode", "123", User.UserType.Doctor)
    );

    public User getUser(String id) {
        return usersMock.stream().filter(user -> user.getUserId().equals(id)).findAny().get();
    }
}
