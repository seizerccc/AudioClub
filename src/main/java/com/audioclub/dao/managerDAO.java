package com.audioclub.dao;

import com.audioclub.entity.Manager;

public interface managerDAO {
    //获取管理员ID获取信息
    Manager selectManagerById(int id);
}
