package com.harbour.ws.dao.jzx;

import com.harbour.ws.domain.jzx.QuayCraneObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuayCraneObjectDao {
    public List<QuayCraneObject> findAll();
}
