package com.harbour.ws.dao.jzx;

import com.harbour.ws.domain.jzx.ContainerShip;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// 集装箱-船舶
public interface ContainerShipDao {
    public List<ContainerShip> findAll();
    public List<ContainerShip> findOne(@Param("code") String code);

}
