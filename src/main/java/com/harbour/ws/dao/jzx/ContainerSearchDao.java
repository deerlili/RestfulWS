package com.harbour.ws.dao.jzx;


import com.harbour.ws.domain.jzx.ContainerSearch;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContainerSearchDao {
    public List<ContainerSearch> findOne(@Param("code") String code);
}
