package com.org.hotelms.service.serviceIMPL;

import com.org.hotelms.entity.User;
import com.org.hotelms.exception.UserNotFoundException;
import com.org.hotelms.repository.UserRepo;
import com.org.hotelms.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allUser=userRepo.findAll();
        return allUser;
    }

    @Override
    public User getOneUser(Long id) {
        Optional<User> u=userRepo.findById(Math.toIntExact(id));
        return u.orElseThrow(()->new UserNotFoundException("User not presernt in id "+ id));
    }

    @Override
    public User createUser(User user) {
//        String x= UUID.randomUUID().toString();

        return userRepo.save(user);
    }

    @Override
    public boolean updateUser(Long id, User user) {


        return false;
    }

    @Override
    public boolean deleteUser(Long id) {
        return false;
    }
}
