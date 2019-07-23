package com.harbour.ws.service;

import com.harbour.ws.domain.jsh.NeobulkYard;

import java.util.List;

public interface NeobulkYardService {
    List<NeobulkYard> findAllJsh();
    List<NeobulkYard> findAllDc();

}
