package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.ContainerBerthTrends;

import java.util.List;

public interface ContainerBerthTrendsService {
    List<ContainerBerthTrends> findAllJzx();
    List<ContainerBerthTrends> findAllDc();
}
