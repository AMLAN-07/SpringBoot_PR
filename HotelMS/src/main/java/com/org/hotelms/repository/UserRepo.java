package com.org.hotelms.repository;

import com.org.hotelms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {


}
