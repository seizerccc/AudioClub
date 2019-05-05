package com.audioclub.service.impl;

import com.audioclub.dao.customerDAO;
import com.audioclub.entity.Customer;
import com.audioclub.service.customerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("customerService")//声明以下类作为Service注入
public class customerServiceImpl implements customerService {
    @Resource
    private customerDAO customerDao;//dao层处理类，自动寻找bean注入

    @Override
    public void insertCust(Customer customer) {
        customerDao.insertCust(customer);
    }

    @Override
    public void deleteCust(int id) {
        customerDao.deleteCust(id);
    }

    @Override
    public void updateCust(Customer customer) {
        customerDao.updateCust(customer);
    }

    @Override
    public Customer selectCustById(int id) {
        return customerDao.selectCustById(id);
    }

    @Override
    public Customer selectCustByName(String name) {
        return customerDao.selectCustByName(name);
    }
}
