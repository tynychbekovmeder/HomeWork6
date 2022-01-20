package org.example.service;

import org.example.dao.FindByIdDao;
import org.example.dao.FindByIdDaoImpl;

public class FindByIdServiceImpl implements FindByIdService{
    FindByIdDao findByIdDao = new FindByIdDaoImpl();
    @Override
    public void findById() {
        findByIdDao.findById();
    }
}
