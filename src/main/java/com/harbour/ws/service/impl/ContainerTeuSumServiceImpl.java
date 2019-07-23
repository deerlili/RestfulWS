package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcContainerTeuSumDao;
import com.harbour.ws.dao.jzx.ContainerShipDao;
import com.harbour.ws.dao.jzx.ContainerTeuSumDao;
import com.harbour.ws.domain.jzx.ContainerShip;
import com.harbour.ws.domain.jzx.ContainerTeuSum;
import com.harbour.ws.service.ContainerShipService;
import com.harbour.ws.service.ContainerTeuSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerTeuSumServiceImpl implements ContainerTeuSumService {

    @Autowired
    private ContainerTeuSumDao containerTeuSumDao;
    @Autowired
    private DcContainerTeuSumDao dcContainerTeuSumDao;

    @Override
    public List<ContainerTeuSum> findAllJzx() {
        return containerTeuSumDao.findAll();
    }

    @Override
    public List<ContainerTeuSum> findAllDc() {
        return dcContainerTeuSumDao.findAll();
    }
}
