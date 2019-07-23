package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcNeobulkCargoSumDao;
import com.harbour.ws.dao.jsh.NeobulkBerthObjectDao;
import com.harbour.ws.dao.jsh.NeobulkCargoSumDao;
import com.harbour.ws.domain.jsh.NeobulkBerthObject;
import com.harbour.ws.domain.jsh.NeobulkCargoSum;
import com.harbour.ws.service.NeobulkBerthObjectService;
import com.harbour.ws.service.NeobulkCargoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeobulkCargoSumServiceImpl implements NeobulkCargoSumService {

    @Autowired
    private NeobulkCargoSumDao neobulkCargoSumDao;
    @Autowired
    private DcNeobulkCargoSumDao dcNeobulkCargoSumDao;


    @Override
    public List<NeobulkCargoSum> findAllJsh() {
        return neobulkCargoSumDao.findAll();
    }

    @Override
    public List<NeobulkCargoSum> findAllDc() {
        return dcNeobulkCargoSumDao.findAll();
    }
}
