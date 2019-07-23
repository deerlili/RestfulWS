package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcNeobulkYardDao;
import com.harbour.ws.dao.jsh.NeobulkYardDao;
import com.harbour.ws.domain.jsh.NeobulkYard;
import com.harbour.ws.service.NeobulkYardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeobulkYardServiceImpl implements NeobulkYardService {

    @Autowired
    private NeobulkYardDao neobulkYardDao;
    @Autowired
    private DcNeobulkYardDao dcNeobulkYardDao;

    @Override
    public List<NeobulkYard> findAllJsh() {
        return neobulkYardDao.findAll();
    }

    @Override
    public List<NeobulkYard> findAllDc() {
        return dcNeobulkYardDao.findAll();
    }
}
