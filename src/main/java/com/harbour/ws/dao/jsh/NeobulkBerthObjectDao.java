package com.harbour.ws.dao.jsh;

import com.harbour.ws.domain.jsh.NeobulkBerthObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NeobulkBerthObjectDao {
    public List<NeobulkBerthObject> findAll();
    public List<NeobulkBerthObject> findOne(@Param("code") String code);
}
