package com.harbour.ws.dao.dc;

import com.harbour.ws.domain.dc.WarehouseObject;

import java.util.List;

public interface DcWarehouseObjectDao {
    public List<WarehouseObject> findAll();
}
