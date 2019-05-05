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

@Controller
public class LoginController {

    @Autowired
    private customerService custService; //自动寻找合适的service的bean并注入


    @GetMapping(value = "/login")
    public String getLoginPage(Model model){
        return "/login";
    }


    @PostMapping(value = "/login")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "id") int id,
                        @RequestParam(required = false, value = "password") String password,
                        @RequestParam(required = false, value = "usertype") String usertype,
                        HttpSession session)
    {
        Integer i =-1;
        //根据登入名字判断此用户是否存在
        if(usertype.equals("customer")){
            Customer customer = custService.selectCustById(id);
            if(customer == null)
            {
                i=1;
                return i;//用户id错误
            }
            else {
                if(customer.getPassword().equals(password))
                {
                    session.setAttribute("currCustomer",customer);
                    i=0;//成功
                    return i;
                }
                else
                {
                    i=2;//密码错误
                    return i;
                }
            }
        }
        else{
            i=3;
            return i;
        }




    }
}
