package com.demo.phones.service;

import com.demo.phones.entity.Phone;
import com.demo.phones.repository.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepo phoneRepo;
    @Override
    public void addPhone(Phone phone) {
        Phone new_phone = phoneRepo.save(phone);
        if(new_phone != null) System.out.println("New Phone for the market.");
    }
}
