package com.audioclub.controller;

import com.audioclub.entity.Customer;
import com.audioclub.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class RegisterController {

    @Autowired
    private customerService custService;


    @GetMapping(value = "/register")
    public String getLoginPage(Model model){
        return "/register";
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "name") String name,
                        @RequestParam(required = false, value = "password") String password,
                        @RequestParam(required = false, value = "phone") String phone,
                        @RequestParam(required = false, value = "address") String address,
                        HttpSession session)
    {
        //设置随机ID和返回消息
        Integer i =0;
        Random rand = new Random();
        int id = rand.nextInt(100000)+1;

        //检测密码长度
        if(password.length()>16){
            i=1;
            return i;
        }
        else{
            Customer newCust = new Customer();
            newCust.setCustomerid(id);
            newCust.setCustomername(name);
            newCust.setPassword(password);
            newCust.setPhone(phone);
            newCust.setAddress(address);

            try{
                custService.insertCust(newCust);
                session.setAttribute("currCustomer",newCust);
            }catch (Exception e){
                i=2;
                return i;
            }
            return  i;
        }
    }

}
