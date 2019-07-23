package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcNeobulkShipDao;
import com.harbour.ws.dao.jsh.NeobulkShipDao;
import com.harbour.ws.domain.jsh.NeobulkShip;
import com.harbour.ws.service.NeobulkShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeobulkShipServiceImpl implements NeobulkShipService {

    @Autowired
    private NeobulkShipDao neobulkShipDao;
    @Autowired
    private DcNeobulkShipDao dcNeobulkShipDao;


    @Override
    public List<NeobulkShip> findAllJsh() {
        return neobulkShipDao.findAll();
    }

    @Override
    public List<NeobulkShip> findAllDc() {
        return dcNeobulkShipDao.findAll();
    }
}
