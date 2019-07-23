package com.harbour.ws.service;


import com.harbour.ws.domain.cc.WarehouseDynamic;

import java.util.List;

public interface WarehouseDynamicService {
    List<WarehouseDynamic> findAllCc();
    List<WarehouseDynamic> findAllDc();
}
