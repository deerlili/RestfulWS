package com.harbour.ws.controller;

import com.harbour.ws.domain.jsh.NeobulkBerthTrends;
import com.harbour.ws.domain.jsh.NeobulkShip;
import com.harbour.ws.service.NeobulkBerthTrendsService;
import com.harbour.ws.service.NeobulkShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 获取件散货业务实时信息
@RestController
public class GetBulkCargoBusinessInfo {

    @Autowired // 集装箱-固定设施-泊位
    private NeobulkBerthTrendsService neobulkBerthTrendsService;
    @Autowired // 集装箱-移动设施-船舶
    private NeobulkShipService neobulkShipService;

    @GetMapping("/getBulkCargoBusinessInfo")
    public String getBulkCargoBusinessInfoMethod(@RequestParam String table) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        if ("1".equals(table)) {
            sb.append("    <rows>\n");
            sb.append("      <th name=\"作业类型: \" value=\"作业类型\"></th>\n");
            sb.append("      <th name=\"计划任务: \" value=\"计划任务\"></th>\n");
            sb.append("      <th name=\"实际完成: \" value=\"实际完成\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"作业类型: \" value=\"装\"></th>\n");
            sb.append("      <th name=\"计划任务: \" value=\"1000\"></th>\n");
            sb.append("      <th name=\"实际完成: \" value=\"222\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"作业类型: \" value=\"卸\"></th>\n");
            sb.append("      <th name=\"计划任务: \" value=\"762\"></th>\n");
            sb.append("      <th name=\"实际完成: \" value=\"237\"></th>\n");
            sb.append("    </rows>\n");
        } else if ("2".equals(table)){
            sb.append("    <rows>\n");
            sb.append("      <th name=\"动态: \" value=\"动态\"></th>\n");
            sb.append("      <th name=\"泊位: \" value=\"泊位\"></th>\n");
            sb.append("      <th name=\"船名: \" value=\"船名\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装卸\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"货种\"></th>\n");
            sb.append("      <th name=\"对象编码: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            List<NeobulkBerthTrends> neobulkBerthTrends;
            try{
                neobulkBerthTrends =  neobulkBerthTrendsService.findAllJsh();
            } catch(Exception e){
                neobulkBerthTrends =  neobulkBerthTrendsService.findAllDc();
            }
            for (int j = 0;j < neobulkBerthTrends.size();j++) {
                sb.append("    <rows>\n");
                sb.append("      <th name=\"动态: \" value=\""+neobulkBerthTrends.get(j).getDt()+"\"></th>\n");
                sb.append("      <th name=\"泊位: \" value=\""+neobulkBerthTrends.get(j).getMc()+"\"></th>\n");
                sb.append("      <th name=\"船名: \" value=\""+neobulkBerthTrends.get(j).getCmc()+"\"></th>\n");
                sb.append("      <th name=\"装卸: \" value=\""+neobulkBerthTrends.get(j).getZxlb()+"\"></th>\n");
                sb.append("      <th name=\"货种: \" value=\""+neobulkBerthTrends.get(j).getHwzl()+"\"></th>\n");
                sb.append("      <th name=\"对象编码: \" value=\""+neobulkBerthTrends.get(j).getCode()+"\"></th>\n");
                sb.append("    </rows>\n");
            }
        } else if("3".equals(table)) {
            sb.append("    <rows>\n");
            sb.append("      <th name=\"日期: \" value=\"日期\"></th>\n");
            sb.append("      <th name=\"船舶: \" value=\"船舶\"></th>\n");
            sb.append("      <th name=\"航次: \" value=\"航次\"></th>\n");
            sb.append("      <th name=\"泊位: \" value=\"泊位\"></th>\n");
            sb.append("      <th name=\"状态: \" value=\"状态\"></th>\n");
            sb.append("      <th name=\"备注: \" value=\"备注\"></th>\n");
            sb.append("    </rows>\n");
            List<NeobulkShip> neobulkShips;
            try{
                neobulkShips =  neobulkShipService.findAllJsh();
            } catch(Exception e){
                neobulkShips =  neobulkShipService.findAllDc();
            }
            for (int j = 0;j < neobulkShips.size();j++) {
                sb.append("    <rows>\n");
                sb.append("       <th name=\"日期: \" value=\""+neobulkShips.get(j).getRq()+"\"></th>\n");
                sb.append("       <th name=\"船舶: \" value=\""+neobulkShips.get(j).getCmc()+"\"></th>\n");
                sb.append("       <th name=\"航次: \" value=\""+neobulkShips.get(j).getHc()+"\"></th>\n");
                sb.append("       <th name=\"泊位: \" value=\""+neobulkShips.get(j).getBwmc()+"\"></th>\n");
                sb.append("       <th name=\"状态: \" value=\""+neobulkShips.get(j).getZt()+"\"></th>\n");
                sb.append("       <th name=\"备注: \" value=\""+neobulkShips.get(j).getBz()+"\"></th>\n");
                sb.append("    </rows>\n");
            }
        }

        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
