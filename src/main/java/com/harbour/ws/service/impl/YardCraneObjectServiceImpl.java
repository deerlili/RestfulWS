package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcYardCraneObjectDao;
import com.harbour.ws.dao.jzx.YardCraneObjectDao;
import com.harbour.ws.domain.jzx.YardCraneObject;
import com.harbour.ws.service.YardCraneObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YardCraneObjectServiceImpl implements YardCraneObjectService {

    @Autowired
    private YardCraneObjectDao yardCraneObjectDao;
    @Autowired
    private DcYardCraneObjectDao dcYardCraneObjectDao;


    @Override
    public List<YardCraneObject> findAllJzx() {
        return yardCraneObjectDao.findAll();
    }

    @Override
    public List<YardCraneObject> findAllDc() {
        return dcYardCraneObjectDao.findAll();
    }
}
