package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcContainerBerthTrendsDao;
import com.harbour.ws.dao.jzx.ContainerBerthTrendsDao;
import com.harbour.ws.domain.jzx.ContainerBerthTrends;
import com.harbour.ws.service.ContainerBerthTrendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerBerthTrendsServiceImpl implements ContainerBerthTrendsService {

    @Autowired
    private ContainerBerthTrendsDao containerBerthTrendsDao;
    @Autowired
    private DcContainerBerthTrendsDao dcContainerBerthTrendsDao;


    @Override
    public List<ContainerBerthTrends> findAllJzx() {
        return containerBerthTrendsDao.findAll();
    }

    @Override
    public List<ContainerBerthTrends> findAllDc() {
        return dcContainerBerthTrendsDao.findAll();
    }
}
