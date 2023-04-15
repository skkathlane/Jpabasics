package com.jpatesting.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String adduser(User user) {
        userRepository.save(user);
        return "user added";
    }
    public List<User> getUser(){
        return userRepository.findAll();
    }
    public User getUserById(int rollNo){
        return userRepository.findById(rollNo).get();
    }
    public String deleteAll(){
        userRepository.deleteAll();
        return "all deleted";
    }
    public String deleteById(int rollNo){
        userRepository.deleteById(rollNo);
        return "user has been deleted";
    }
    public String userUpdate(String name,int rollNo){
        userRepository.findById(rollNo).get().setName(name);
        return "name has been updated";
    }

}
