package com.demo.phones.service;

import com.demo.phones.entity.Phone;
import com.demo.phones.entity.User;
import com.demo.phones.repository.PhoneRepo;
import com.demo.phones.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PhoneRepo phoneRepo;
    @Override
    public void newPhoneUser(User user) {
        User new_user = userRepo.save(user);
        if(new_user != null) System.out.println("New phone user.");
    }

    @Override
    public void buyNewPhone(Long userId, Long phoneId) {
        User user = userRepo.findById(userId).get();
        Phone phone = phoneRepo.findById(phoneId).get();

        user.getPhones().add(phone);
        System.out.println(user.getUserName() + " bought a new phone.");
    }
}
