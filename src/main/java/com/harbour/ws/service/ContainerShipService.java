package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.ContainerShip;

import java.util.List;

public interface ContainerShipService {
    List<ContainerShip> findAllJzx();
    List<ContainerShip> findAllDc();

}
