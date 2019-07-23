package com.harbour.ws.service;

import com.harbour.ws.domain.jsh.NeobulkBerthObject;

import java.util.List;

public interface NeobulkBerthObjectService {
    List<NeobulkBerthObject> findAllJsh();
    List<NeobulkBerthObject> findAllDc();
    //List<NeobulkBerthObject> findOne(String code);
}
