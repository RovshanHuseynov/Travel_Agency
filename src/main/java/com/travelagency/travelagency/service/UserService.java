package com.travelagency.travelagency.service;

import com.travelagency.travelagency.entity.User;
import com.travelagency.travelagency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User get(int userId){
        return userRepository.findById(userId).get();
    }

    public User add(User user){
        return userRepository.save(user);
    }

    public void delete(int userId){
        userRepository.deleteById(userId);
    }
}
