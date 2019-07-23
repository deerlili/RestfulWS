package com.harbour.ws.service.impl;

import com.harbour.ws.dao.cc.WarehouseDynamicDao;
import com.harbour.ws.dao.dc.DcWarehouseDynamicDao;
import com.harbour.ws.domain.cc.WarehouseDynamic;
import com.harbour.ws.service.WarehouseDynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseDynamicServiceImpl implements WarehouseDynamicService {

    @Autowired
    private WarehouseDynamicDao warehouseDynamicDao;
    @Autowired
    private DcWarehouseDynamicDao dcWarehouseDynamicDao;

    @Override
    public List<WarehouseDynamic> findAllCc() {
        return warehouseDynamicDao.findAll();
    }

    @Override
    public List<WarehouseDynamic> findAllDc() {
        return dcWarehouseDynamicDao.findAll();
    }
}
