package com.harbour.ws.dao.jsh;

import com.harbour.ws.domain.jsh.NeobulkShip;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NeobulkShipDao {
    public List<NeobulkShip> findAll();
}
