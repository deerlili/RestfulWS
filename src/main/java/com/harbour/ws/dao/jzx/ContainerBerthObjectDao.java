package com.harbour.ws.dao.jzx;

import com.harbour.ws.domain.jzx.ContainerBerthObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContainerBerthObjectDao {
    public List<ContainerBerthObject> findAll();
}
