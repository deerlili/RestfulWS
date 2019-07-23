package com.harbour.ws.dao.jzx;

import com.harbour.ws.domain.jzx.YardCraneObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YardCraneObjectDao {
    public List<YardCraneObject> findAll();
}
