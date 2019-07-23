package com.harbour.ws.controller;



import com.harbour.ws.domain.jsh.NeobulkBerthObject;
import com.harbour.ws.domain.jzx.ContainerSearch;
import com.harbour.ws.service.ContainerSearchService;
import com.harbour.ws.service.NeobulkBerthObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 获取某一类对象实时基本数据
@RestController
public class Test {

    @GetMapping("/test")
    public String getObjectListInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
