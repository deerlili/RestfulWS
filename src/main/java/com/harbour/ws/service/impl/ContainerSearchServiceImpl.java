package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcContainerSearchDao;
import com.harbour.ws.dao.jzx.ContainerSearchDao;
import com.harbour.ws.domain.jzx.ContainerSearch;
import com.harbour.ws.service.ContainerSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerSearchServiceImpl implements ContainerSearchService {

    @Autowired
    private ContainerSearchDao containerSearchDao;
    @Autowired
    private DcContainerSearchDao dcContainerSearchDao;

    @Override
    public List<ContainerSearch> findOneJzx(String code) {
        return containerSearchDao.findOne(code);
    }

    @Override
    public List<ContainerSearch> findOneDc(String code) {
        return dcContainerSearchDao.findOne(code);
    }
}
