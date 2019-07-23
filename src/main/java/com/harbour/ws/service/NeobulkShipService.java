package com.harbour.ws.service;


import com.harbour.ws.domain.jsh.NeobulkShip;

import java.util.List;

public interface NeobulkShipService {
    List<NeobulkShip> findAllJsh();
    List<NeobulkShip> findAllDc();
}
