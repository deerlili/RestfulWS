package com.harbour.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 获取铁路业务实时信息
@RestController
public class GetRailwayBusinessInfo {

    @GetMapping("/getRailwayBusinessInfo")
    public String getRailwayBusinessInfoMethod(@RequestParam String table) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        //果滚停车场
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
            sb.append("      <th name=\"实际完成: \" value=\"456\"></th>\n");
            sb.append("    </rows>\n");
        } else if ("2".equals(table)){
            sb.append("    <rows>\n");
            sb.append("      <th name=\"动态: \" value=\"动态\"></th>\n");
            sb.append("      <th name=\"线路: \" value=\"线路\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"车次\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装卸\"></th>\n");
            sb.append("      <th name=\"对象编码: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"动态: \" value=\"作业\"></th>\n");
            sb.append("      <th name=\"线路: \" value=\"K1\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"456\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装\"></th>\n");
            sb.append("      <th name=\"对象编码: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"动态: \" value=\"等待\"></th>\n");
            sb.append("      <th name=\"线路: \" value=\"K2\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"456\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"卸\"></th>\n");
            sb.append("      <th name=\"对象编码: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
        } else if("3".equals(table)) {
            sb.append("    <rows>\n");
            sb.append("      <th name=\"日期: \" value=\"日期\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"车次\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"货种\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装卸\"></th>\n");
            sb.append("      <th name=\"备注: \" value=\"备注\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"日期: \" value=\"5-1\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"K123\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"煤\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装\"></th>\n");
            sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"日期: \" value=\"5-2\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"K123\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"煤\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装\"></th>\n");
            sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"日期: \" value=\"5-3\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"K123\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"煤\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装\"></th>\n");
            sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
            sb.append("    <rows>\n");
            sb.append("      <th name=\"日期: \" value=\"5-4\"></th>\n");
            sb.append("      <th name=\"车次: \" value=\"K123\"></th>\n");
            sb.append("      <th name=\"货种: \" value=\"煤\"></th>\n");
            sb.append("      <th name=\"装卸: \" value=\"装\"></th>\n");
            sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
            sb.append("    </rows>\n");
        };
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
