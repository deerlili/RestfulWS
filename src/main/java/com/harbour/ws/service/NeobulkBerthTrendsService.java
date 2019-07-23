package com.harbour.ws.service;

import com.harbour.ws.domain.jsh.NeobulkBerthTrends;

import java.util.List;

public interface NeobulkBerthTrendsService {
    List<NeobulkBerthTrends> findAllJsh();
    List<NeobulkBerthTrends> findAllDc();

}

