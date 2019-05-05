package com.audioclub.service.impl;

import com.audioclub.dao.managerDAO;
import com.audioclub.entity.Manager;
import com.audioclub.service.managerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("managerService")//声明以下类作为Service注入
public class managerServiceImpl implements managerService {

    @Resource
    private managerDAO managerDao;

    @Override
    public Manager selectManagerById(int id) {
        return managerDao.selectManagerById(id);
    }
}
