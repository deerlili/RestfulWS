package com.harbour.ws.controller;

import com.harbour.ws.domain.jsh.NeobulkCargoSum;
import com.harbour.ws.domain.jzx.ContainerTeuSum;
import com.harbour.ws.service.ContainerTeuSumService;
import com.harbour.ws.service.NeobulkCargoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 获取港口实时汇总信息
@RestController
public class GetSummaryInfo {

    @Autowired // 集装箱-移动设施-船舶-Y10
    private NeobulkCargoSumService neobulkCargoSumService;
    @Autowired
    private ContainerTeuSumService containerTeuSumService;

    Double cargo;
    int  teu;

    @GetMapping("/getSummaryInfo")
    public String getSummaryInfoMethod() {

        List<NeobulkCargoSum> cargoSums;
        List<ContainerTeuSum> teuSums;

        try{
            cargoSums = neobulkCargoSumService.findAllJsh();
        }catch(Exception e){
            cargoSums = neobulkCargoSumService.findAllDc();
        }

        try{
            teuSums = containerTeuSumService.findAllJzx();
        }catch(Exception e){
            teuSums = containerTeuSumService.findAllDc();
        }

        if(cargoSums.isEmpty()) {
            cargo = 0.0;
        } else {
            cargo = cargoSums.get(0).getZl();
        }

        if(teuSums.isEmpty()) {
            teu = 0;
        } else {
            teu = teuSums.get(0).getTeuSum();
        }

        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        sb.append("    <rows>\n");
        sb.append("         <th name=\"货物吞吐量: \">"+cargo+"(万吨)</th>\n");
        sb.append("         <th name=\"集装箱吞吐量: \">"+teu+"(TEU)</th>\n");
        sb.append("    </rows>\n");
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
