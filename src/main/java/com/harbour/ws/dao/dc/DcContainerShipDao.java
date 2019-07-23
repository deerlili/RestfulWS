package com.harbour.ws.dao.dc;

import com.harbour.ws.domain.jzx.ContainerShip;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// 集装箱-船舶
public interface DcContainerShipDao {
    public List<ContainerShip> findAll();

}
