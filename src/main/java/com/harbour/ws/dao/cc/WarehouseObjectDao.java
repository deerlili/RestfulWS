package com.harbour.ws.dao.cc;

import com.harbour.ws.domain.cc.WarehouseObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseObjectDao {
    public List<WarehouseObject> findAll();
}
