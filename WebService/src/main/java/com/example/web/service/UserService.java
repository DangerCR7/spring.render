package com.example.web.service;

import com.example.web.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService {

    private Map<String, User> users = new HashMap<>();

    public User createUser(String name, String email) {
        String id = UUID.randomUUID().toString();
        User user = new User(id, name, email);
        users.put(id, user);
        return user;
    }

    public User getUserById(String id) {
        return users.get(id);
    }

    public Map<String, User> getAllUsers() {
        return users;
    }

    public void deleteUser(String id) {
        users.remove(id);
    }
}
