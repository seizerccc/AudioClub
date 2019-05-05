package com.audioclub.controller;


import com.audioclub.service.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaccountController {

    @Autowired
    private managerService managerservice;


    @GetMapping(value = "/maccount")
    public String getLoginPage(Model model){
        return "/maccount";
    }
}
