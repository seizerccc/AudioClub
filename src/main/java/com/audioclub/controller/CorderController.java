package com.audioclub.controller;

import com.audioclub.entity.Customer;
import com.audioclub.entity.Order;
import com.audioclub.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CorderController {

    @Autowired
    private orderService orderservice;

    @GetMapping(value = "/corder")
    public String getLoginPage(Model model, HttpSession session){

        Customer customer = (Customer)session.getAttribute("currCustomer");
        List<Order> orders = orderservice.selectCustOrder(customer.getCustomerid());
        session.setAttribute("currOrders",orders);

        return "/corder";
    }


    @PostMapping(value = "/corder")
    @ResponseBody
    public Object order(@RequestParam(required = false, value = "productid") int productid,
                        @RequestParam(required = false, value = "ordertime") String ordertime,
                        HttpSession session)
    {
        Integer i = -1;
        Customer customer = (Customer)session.getAttribute("currCustomer");
        int customerid = customer.getCustomerid();


        orderservice.deleteOrder(customerid,productid,ordertime);
        i=0;
        return i;
    }


}
