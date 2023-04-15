package com.jpatesting.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String adduser(@RequestBody User user){
      return  userService.adduser(user);
    }
    @GetMapping("/getusers")
    public List<User> getUser(){
    return userService.getUser();
    }
    @GetMapping("/getuser")
    public User getUserById(@RequestParam("id") int rollNo){
        return userService.getUserById(rollNo);

    }
    @DeleteMapping("/deleteall")
    public String deleteAll(){
        return userService.deleteAll();
    }
    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam("no") int rollNo){
        return userService.deleteById(rollNo);
    }
    @PutMapping("/update")
    public String userUpdate(@RequestParam String name,@RequestParam int rollNo){
        return userService.userUpdate(name,rollNo);
    }
}
