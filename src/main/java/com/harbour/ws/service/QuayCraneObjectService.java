package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.QuayCraneObject;

import java.util.List;

public interface QuayCraneObjectService {
    List<QuayCraneObject> findAllJzx();
    List<QuayCraneObject> findAllDc();

}
