package com.demo.phones.controller;

import com.demo.phones.entity.Phone;
import com.demo.phones.entity.User;
import com.demo.phones.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("")
    public void newPhoneUser(@RequestBody User user){
        userService.newPhoneUser(user);
    }

    @PutMapping("/{userId}/phones/{phoneId}")
    public void buyNewPhone(@PathVariable Long userId, @PathVariable Long phoneId){
        userService.buyNewPhone(userId, phoneId);
    }
}
