package com.harbour.ws.service;

import com.harbour.ws.domain.cc.WarehouseProductionSum;

import java.util.List;

public interface WarehouseProductionSumService {
    List<WarehouseProductionSum> findAllCc();
    List<WarehouseProductionSum> findAllDc();
}
