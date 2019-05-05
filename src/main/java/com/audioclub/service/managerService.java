package com.audioclub.service;


import com.audioclub.entity.Manager;

public interface managerService {

    //获取管理员ID获取信息
    Manager selectManagerById(int id);
}
