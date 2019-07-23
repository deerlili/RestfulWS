package com.harbour.ws.service.impl;

import com.harbour.ws.dao.cc.WarehouseObjectDao;
import com.harbour.ws.dao.dc.DcWarehouseObjectDao;
import com.harbour.ws.domain.cc.WarehouseObject;
import com.harbour.ws.service.WarehouseObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseObjectServiceImpl implements WarehouseObjectService {

    @Autowired
    private WarehouseObjectDao warehouseObjectDao;
    @Autowired
    private DcWarehouseObjectDao dcWarehouseObjectDao;


    @Override
    public List<WarehouseObject> findAllCc() {
        return warehouseObjectDao.findAll();
    }

    @Override
    public List<com.harbour.ws.domain.dc.WarehouseObject> findAllDc() {
        return dcWarehouseObjectDao.findAll();
    }
}
