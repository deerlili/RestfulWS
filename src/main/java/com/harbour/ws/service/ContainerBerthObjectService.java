package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.ContainerBerthObject;

import java.util.List;

public interface ContainerBerthObjectService {
    List<ContainerBerthObject> findAllJzx();
    List<ContainerBerthObject> findAllDc();

}
