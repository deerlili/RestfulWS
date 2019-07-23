package com.harbour.ws.controller;

import com.harbour.ws.domain.jzx.ContainerBerthTrends;
import com.harbour.ws.domain.jzx.ContainerShip;
import com.harbour.ws.service.ContainerBerthTrendsService;
import com.harbour.ws.service.ContainerShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 获取集装箱业务实时信息
@RestController
public class GetContainerBusinessInfo {

    //集装箱-泊位动态-果集table2
    @Autowired
    private ContainerBerthTrendsService containerBerthTrendsService;
    //集装箱-船舶计划-果集table3
    @Autowired
    private ContainerShipService containerShipService;

    @GetMapping("/getContainerBusinessInfo")
    public String getContainerBusinessInfoMethod(@RequestParam String table) {
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
            sb.append("      <th name=\"实际完成: \" value=\"456\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"作业类型: \" value=\"卸\"></th>\n");
            sb.append("      <th name=\"计划任务: \" value=\"1000\"></th>\n");
            sb.append("      <th name=\"实际完成: \" value=\"111\"></th>\n");
            sb.append("    </rows>\n");
        } else if ("2".equals(table)){
            sb.append("    <rows>\n");
            sb.append("      <th name=\"动态: \" value=\"动态\"></th>\n");
            sb.append("      <th name=\"泊位: \" value=\"泊位\"></th>\n");
            sb.append("      <th name=\"船名: \" value=\"船名\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装卸\"></th>\n");
            sb.append("      <th name=\"对象编码: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            List<ContainerBerthTrends> listTrends;
            try{
                listTrends =  containerBerthTrendsService.findAllJzx();
            } catch(Exception e){
                listTrends =  containerBerthTrendsService.findAllDc();
            }
            for (int j = 0;j < listTrends.size();j++) {
                sb.append("    <rows>\n");
                sb.append("      <th name=\"动态: \" value=\""+listTrends.get(j).getDt()+"\"></th>\n");
                sb.append("      <th name=\"泊位: \" value=\""+listTrends.get(j).getMc()+"\"></th>\n");
                sb.append("      <th name=\"船名: \" value=\""+listTrends.get(j).getCmc()+"\"></th>\n");
                sb.append("      <th name=\"装卸: \" value=\""+listTrends.get(j).getZxlb()+"\"></th>\n");
                sb.append("      <th name=\"对象编码: \" value=\""+listTrends.get(j).getCode()+"\"></th>\n");
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
            List<ContainerShip> containerShips;
            try{
                containerShips =  containerShipService.findAllJzx();
            } catch(Exception e){
                containerShips =  containerShipService.findAllDc();
            }
            for (int j = 0;j < containerShips.size();j++) {
                sb.append("    <rows>\n");
                sb.append("      <th name=\"日期: \" value=\""+containerShips.get(j).getRq()+"\"></th>\n");
                sb.append("      <th name=\"船舶: \" value=\""+containerShips.get(j).getCmc()+"\"></th>\n");
                sb.append("      <th name=\"航次: \" value=\""+containerShips.get(j).getHc()+"\"></th>\n");
                sb.append("      <th name=\"泊位: \" value=\""+containerShips.get(j).getBwmc()+"\"></th>\n");
                sb.append("      <th name=\"状态: \" value=\""+containerShips.get(j).getZt()+"\"></th>\n");
                sb.append("      <th name=\"备注: \" value=\""+containerShips.get(j).getBz()+"\"></th>\n");
                sb.append("    </rows>\n");
            }
        }
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}