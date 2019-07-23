package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcContainerYardObjectDao;
import com.harbour.ws.dao.jzx.ContainerYardObjectDao;
import com.harbour.ws.domain.jzx.ContainerYardObject;
import com.harbour.ws.service.ContainerYardObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerYardObjectServiceImpl implements ContainerYardObjectService {

    @Autowired
    private ContainerYardObjectDao jzxContainerYardObjectDao;
    @Autowired
    private DcContainerYardObjectDao dcContainerYardObjectDao;


    @Override
    public List<ContainerYardObject> findAllJzx() {
        return jzxContainerYardObjectDao.findAll();
    }

    @Override
    public List<ContainerYardObject> findAllDc() {
        return dcContainerYardObjectDao.findAll();
    }
}
