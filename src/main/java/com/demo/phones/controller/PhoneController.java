package com.demo.phones.controller;

import com.demo.phones.entity.Phone;
import com.demo.phones.service.PhoneService;
import com.demo.phones.service.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phones")
public class PhoneController {

    @Autowired
    private PhoneServiceImpl phoneService;

    @PostMapping("")
    public void addPhone(@RequestBody Phone phone){
        phoneService.addPhone(phone);
    }
}
