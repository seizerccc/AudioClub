package com.audioclub.dao;

import com.audioclub.entity.Customer;
import org.apache.ibatis.annotations.Param;

public interface customerDAO {
    //插入用户信息
    void insertCust(@Param("customer")Customer customer);

    //删除用户信息
    void deleteCust(int id);

    //更新用户信息
    void updateCust(@Param("customer_1")Customer customer);

    //根据ID获取用户信息
    Customer selectCustById(int id);

    //根据姓名获取用户信息
    Customer selectCustByName(String name);
}
