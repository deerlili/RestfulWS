package com.harbour.ws.controller;

import com.harbour.ws.domain.jzx.ContainerSearch;
import com.harbour.ws.service.ContainerSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 通过集装箱获取堆场名称
@RestController
public class GetYardByContainer {

    @Autowired
    private ContainerSearchService containerSearchService;

    String mc;
    String objectcode;

    @GetMapping("/getYardByContainer")
    public String getYardByContainerMethod(@RequestParam String code) {

        List<ContainerSearch> containers;
        try{
            // 从集装箱获取数据
            containers = containerSearchService.findOneJzx(code);
        }catch(Exception e){
            // 从数据中心货物数据
            containers = containerSearchService.findOneDc(code);
        }

        if(containers.isEmpty()) {
            // 若获取的数据为空对其赋值
            mc = "-";
            objectcode = "-";
        } else {
            mc = containers.get(0).getMc();
            objectcode = containers.get(0).getCode();
        }
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        sb.append("    <rows>\n");
        sb.append("      <th name=\"对象编码: \" value=\""+objectcode+"\"></th>\n");
        sb.append("      <th name=\"对象名称: \" value=\""+mc+"\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
