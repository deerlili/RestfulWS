package com.harbour.ws.service;

import com.harbour.ws.domain.jsh.NeobulkCargoSum;

import java.util.List;

public interface NeobulkCargoSumService {
    List<NeobulkCargoSum> findAllJsh();
    List<NeobulkCargoSum> findAllDc();
}
