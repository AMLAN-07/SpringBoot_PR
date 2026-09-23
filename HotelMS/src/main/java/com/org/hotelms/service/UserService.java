package com.org.hotelms.service;

import com.org.hotelms.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getOneUser(Long id);
    User createUser(User user);
    boolean updateUser(Long id, User user);
    boolean deleteUser(Long id);
}
