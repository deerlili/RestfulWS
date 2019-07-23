package com.harbour.ws.dao.dc;

import com.harbour.ws.domain.jsh.NeobulkYard;

import java.util.List;

public interface DcNeobulkYardDao {
    public List<NeobulkYard> findAll();
    public List<NeobulkYard> findOne();

}
