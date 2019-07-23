package com.harbour.ws.service;

import com.harbour.ws.domain.jzx.ContainerSearch;

import java.util.List;

public interface ContainerSearchService {
    List<ContainerSearch> findOneJzx(String code);
    List<ContainerSearch> findOneDc(String code);

}
