package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcQuayCraneObjectDao;
import com.harbour.ws.dao.jzx.QuayCraneObjectDao;
import com.harbour.ws.domain.jzx.QuayCraneObject;
import com.harbour.ws.service.QuayCraneObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuayCraneObjectServiceImpl implements QuayCraneObjectService {

    @Autowired
    private QuayCraneObjectDao quayCraneObjectDao;
    @Autowired
    private DcQuayCraneObjectDao dcQuayCraneObjectDao;


    @Override
    public List<QuayCraneObject> findAllJzx() {
        return quayCraneObjectDao.findAll();
    }

    @Override
    public List<QuayCraneObject> findAllDc() {
        return dcQuayCraneObjectDao.findAll();
    }
}
