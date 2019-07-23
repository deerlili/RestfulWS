package com.harbour.ws.controller;

import com.harbour.ws.domain.cc.WarehouseDynamic;
import com.harbour.ws.domain.cc.WarehouseProductionSum;
import com.harbour.ws.service.ContainerBerthTrendsService;
import com.harbour.ws.service.WarehouseDynamicService;
import com.harbour.ws.service.WarehouseProductionSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 获取两江仓库业务实时信息
@RestController
public class GetLiangjiangWarehouseBusinessInfo {

    @Autowired
    private WarehouseDynamicService warehouseDynamicService;
    @Autowired
    private WarehouseProductionSumService warehouseProductionSumService;

    @GetMapping("/getLiangjiangWarehouseBusinessInfo")
    public String getLiangjiangWarehouseBusinessInfoMethod(@RequestParam String table) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        List<WarehouseDynamic> warehouseDynamics;
        List<WarehouseProductionSum> warehouseProductionSums;
        try{
            warehouseDynamics =  warehouseDynamicService.findAllCc();
            warehouseProductionSums =  warehouseProductionSumService.findAllCc();
        } catch(Exception e){
            warehouseDynamics =  warehouseDynamicService.findAllDc();
            warehouseProductionSums =  warehouseProductionSumService.findAllDc();
        }
        if ("1".equals(table)) {
            sb.append("    <rows>\n");
            sb.append("      <th name=\"作业类型: \" value=\"作业类型\"></th>\n");
            sb.append("      <th name=\"日累计: \" value=\"日累计\"></th>\n");
            sb.append("      <th name=\"月累计: \" value=\"月累计\"></th>\n");
            sb.append("    </rows>\n");
            for (int j = 0;j < warehouseProductionSums.size();j++) {
                sb.append("    <rows>\n");
                sb.append("      <th name=\"作业类型: \" value=\""+warehouseProductionSums.get(j).getType()+"\"></th>\n");
                sb.append("      <th name=\"日累计: \" value=\""+warehouseProductionSums.get(j).getDd()+"\"></th>\n");
                sb.append("      <th name=\"月累计: \" value=\""+warehouseProductionSums.get(j).getMm()+"\"></th>\n");
                sb.append("    </rows>\n");
            }
        } else if ("2".equals(table)){
            sb.append("    <rows>\n");
            sb.append("      <th name=\"仓库: \" value=\"仓库\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"货种\"></th>\n");
            sb.append("      <th name=\"库存: \" value=\"库存\"></th>\n");
            sb.append("    </rows>\n");
            for (int j = 0;j < warehouseDynamics.size();j++) {
                sb.append("    <rows>\n");
                sb.append("      <th name=\"仓库: \" value=\""+warehouseDynamics.get(j).getCk()+"\"></th>\n");
                sb.append("      <th name=\"货种: \" value=\""+warehouseDynamics.get(j).getHwzl()+"\"></th>\n");
                sb.append("      <th name=\"库存: \" value=\""+warehouseDynamics.get(j).getHz()+"\"></th>\n");
                sb.append("    </rows>\n");
            }
        }
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
