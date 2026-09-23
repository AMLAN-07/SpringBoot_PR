package com.org.hotelms.service.serviceIMPL;

import com.org.hotelms.entity.User;
import com.org.hotelms.exception.UserNotFoundException;
import com.org.hotelms.repository.UserRepo;
import com.org.hotelms.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    @Override
    public List<User> getAllUser() {
        List<User> allUser=userRepo.findAll();
        return allUser;
    }

    @Override
    public User getOneUser(Long id) {
        Optional<User> u=userRepo.findById();
        return u.orElseThrow(()->new UserNotFoundException("User not presernt in id "+ id));
    }

    @Override
    public User createUser(User user) {
        User u1= userRepo.save(user);
        return u1;
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
