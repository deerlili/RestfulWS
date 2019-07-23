package com.harbour.ws.service.impl;


import com.harbour.ws.dao.cc.WarehouseProductionSumDao;
import com.harbour.ws.domain.cc.WarehouseProductionSum;
import com.harbour.ws.service.WarehouseProductionSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseProductionSumServiceImpl implements WarehouseProductionSumService {

    @Autowired
    private WarehouseProductionSumDao warehouseProductionSumDao;


    @Override
    public List<WarehouseProductionSum> findAllCc() {
        return warehouseProductionSumDao.findAll();
    }

    @Override
    public List<WarehouseProductionSum> findAllDc() {
        return null;
    }
}
