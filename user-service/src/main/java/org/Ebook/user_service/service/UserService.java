package org.Ebook.user_service.service;

import org.Ebook.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.*;

@Service
public class UserService {

    private final Map<String, User> userStore = new HashMap<>();

    public List<User> getAllUsers() {
        return new ArrayList<>(userStore.values());
    }

    public User getUserById(String userId) {
        return userStore.get(userId);
    }

    public User createUser(User user) {
        userStore.put(user.getId(), user);
        return user;
    }

    public User updateUser(String userId, User updatedUser) {
        userStore.put(userId, updatedUser);
        return updatedUser;
    }

    public void deleteUser(String userId) {
        userStore.remove(userId);
    }
}