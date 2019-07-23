package com.harbour.ws.dao.dc;

import com.harbour.ws.domain.jsh.NeobulkBerthObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcNeobulkBerthObjectDao {
    public List<NeobulkBerthObject> findAll();
    public List<NeobulkBerthObject> findOne(@Param("code") String code);
}
