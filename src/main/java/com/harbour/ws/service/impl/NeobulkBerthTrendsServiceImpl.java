package com.harbour.ws.service.impl;

import com.harbour.ws.dao.dc.DcNeobulkBerthTrendsDao;
import com.harbour.ws.dao.jsh.NeobulkBerthTrendsDao;
import com.harbour.ws.domain.jsh.NeobulkBerthTrends;
import com.harbour.ws.service.NeobulkBerthTrendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeobulkBerthTrendsServiceImpl implements NeobulkBerthTrendsService {

    @Autowired
    private NeobulkBerthTrendsDao neobulkBerthTrendsDao;
    @Autowired
    private DcNeobulkBerthTrendsDao dcNeobulkBerthTrendsDao;

    @Override
    public List<NeobulkBerthTrends> findAllJsh() {
        return neobulkBerthTrendsDao.findAll();
    }

    @Override
    public List<NeobulkBerthTrends> findAllDc() {
        return dcNeobulkBerthTrendsDao.findAll();
    }
}
