package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.ContainerYardObject;

import java.util.List;

public interface ContainerYardObjectService {
    List<ContainerYardObject> findAllJzx();
    List<ContainerYardObject> findAllDc();
}
