package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcContainerBerthObjectDao;
import com.harbour.ws.domain.jzx.ContainerBerthObject;
import com.harbour.ws.dao.jzx.ContainerBerthObjectDao;
import com.harbour.ws.service.ContainerBerthObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerBerthObjectServiceImpl implements ContainerBerthObjectService {

    @Autowired
    private ContainerBerthObjectDao containerBerthObjectDao;
    @Autowired
    private DcContainerBerthObjectDao dcContainerBerthObjectDao;


    @Override
    public List<ContainerBerthObject> findAllJzx() {
        return containerBerthObjectDao.findAll();
    }

    @Override
    public List<ContainerBerthObject> findAllDc() {
        return dcContainerBerthObjectDao.findAll();
    }
}
