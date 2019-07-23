package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcNeobulkBerthObjectDao;
import com.harbour.ws.dao.jsh.NeobulkBerthObjectDao;
import com.harbour.ws.domain.jsh.NeobulkBerthObject;
import com.harbour.ws.service.NeobulkBerthObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeobulkBerthObjectServiceImpl implements NeobulkBerthObjectService {

    @Autowired
    private NeobulkBerthObjectDao neobulkBerthObjectDao;
    @Autowired
    private DcNeobulkBerthObjectDao dcNeobulkBerthObjectDao;



    @Override
    public List<NeobulkBerthObject> findAllJsh() {
        return neobulkBerthObjectDao.findAll();
    }

    @Override
    public List<NeobulkBerthObject> findAllDc() {
        return dcNeobulkBerthObjectDao.findAll();
    }
}
