package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcContainerShipDao;
import com.harbour.ws.dao.jzx.ContainerShipDao;
import com.harbour.ws.domain.jzx.ContainerShip;
import com.harbour.ws.service.ContainerShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerShipServiceImpl implements ContainerShipService {

    @Autowired
    private  ContainerShipDao containerShipDao;
    @Autowired
    private DcContainerShipDao dcContainerShipDao;

    @Override
    public List<ContainerShip> findAllJzx() {
        return containerShipDao.findAll();
    }

    @Override
    public List<ContainerShip> findAllDc() {
        return dcContainerShipDao.findAll();
    }
}
