package com.harbour.ws.controller;

import com.harbour.ws.domain.jzx.ContainerSearch;
import com.harbour.ws.service.ContainerSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 通过集装箱获取作业线
@RestController
public class GetYardProductionLine {

    @GetMapping("/getYardProductionLine")
    public String getYardProductionLineMethod(@RequestParam String code) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"序号: \" value=\"1\"></th>\n");
        sb.append("      <th name=\"类型: \" value=\"固定设施\"></th>\n");
        sb.append("      <th name=\"要素: \" value=\"1#泊位\"></th>\n");
        sb.append("      <th name=\"备注: \" value=\"泊：港盛1065\"></th>\n");
        sb.append("      <th name=\"对象编码: \" value=\"JZX-S01-0001\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"序号: \" value=\"2\"></th>\n");
        sb.append("      <th name=\"类型: \" value=\"固定设施\"></th>\n");
        sb.append("      <th name=\"要素: \" value=\"13堆场\"></th>\n");
        sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
        sb.append("      <th name=\"对象编码: \" value=\"JZX-S02-0004\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"序号: \" value=\"3\"></th>\n");
        sb.append("      <th name=\"类型: \" value=\"固定机械\"></th>\n");
        sb.append("      <th name=\"要素: \" value=\"3#岸桥\"></th>\n");
        sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
        sb.append("      <th name=\"对象编码: \" value=\"JZX-J01-0003\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"序号: \" value=\"4\"></th>\n");
        sb.append("      <th name=\"类型: \" value=\"固定机械\"></th>\n");
        sb.append("      <th name=\"要素: \" value=\"14-2#场桥\"></th>\n");
        sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
        sb.append("      <th name=\"对象编码: \" value=\"JZX-J02-0006\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"序号: \" value=\"5\"></th>\n");
        sb.append("      <th name=\"类型: \" value=\"移动对象\"></th>\n");
        sb.append("      <th name=\"要素: \" value=\"渝B.12ASE\"></th>\n");
        sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
        sb.append("      <th name=\"对象编码: \" value=\"100026\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"序号: \" value=\"6\"></th>\n");
        sb.append("      <th name=\"类型: \" value=\"移动对象\"></th>\n");
        sb.append("      <th name=\"要素: \" value=\"2#班组\"></th>\n");
        sb.append("      <th name=\"备注: \" value=\"\"></th>\n");
        sb.append("      <th name=\"对象编码: \" value=\"00024\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}