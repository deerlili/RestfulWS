package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.YardCraneObject;

import java.util.List;

public interface YardCraneObjectService {
    List<YardCraneObject> findAllJzx();
    List<YardCraneObject> findAllDc();

}
