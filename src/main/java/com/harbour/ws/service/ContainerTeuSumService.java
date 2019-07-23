package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.ContainerShip;
import com.harbour.ws.domain.jzx.ContainerTeuSum;

import java.util.List;

public interface ContainerTeuSumService {
    List<ContainerTeuSum> findAllJzx();
    List<ContainerTeuSum> findAllDc();
}
