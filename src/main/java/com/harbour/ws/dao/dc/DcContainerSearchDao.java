package com.harbour.ws.dao.dc;


import com.harbour.ws.domain.jzx.ContainerSearch;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcContainerSearchDao {
    public List<ContainerSearch> findOne(@Param("code") String code);
}
