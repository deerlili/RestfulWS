package com.harbour.ws.service;




import java.util.List;

public interface WarehouseObjectService {

    List<com.harbour.ws.domain.cc.WarehouseObject> findAllCc();
    List<com.harbour.ws.domain.dc.WarehouseObject> findAllDc();
}
