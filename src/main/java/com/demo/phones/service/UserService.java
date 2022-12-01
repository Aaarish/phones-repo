package com.demo.phones.service;

import com.demo.phones.entity.Phone;
import com.demo.phones.entity.User;

public interface UserService {
    void newPhoneUser(User user);

    void buyNewPhone(Long userId, Long phoneId);
}
