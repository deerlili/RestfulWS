package com.harbour.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 获取对象基础分类
@RestController
public class GetObjectTypes {

    // 获取对象基础分类
    @GetMapping("/getObjectTypes")
    public String getObjectTypesMethod() {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");
        sb.append("    <rows>\n");
        sb.append("		<th name=\"公司名称: \" value=\"果集\"></th>\n");
        sb.append("		<th name=\"公司编码: \" value=\"GJ \"></th>\n");
        sb.append("		<th name=\"大类编码: \" value=\"GJ-01\"></th>\n");
        sb.append("		<th name=\"大类名称: \" value=\"固定设施\"></th>\n");
        sb.append("		<th name=\"对象类别编码: \" value=\"GJ-01-01\"></th>\n");
        sb.append("		<th name=\"对象类别名称: \" value=\"岸桥\"></th>\n");
        sb.append("		<th name=\"对象编码: \" value=\"GJ-01-01-0001\"></th>\n");
        sb.append("		<th name=\"对象名称: \" value=\"1#岸桥\"></th>\n");
        sb.append("		<th name=\"备注: \" value=\"\"></th>\n");
        sb.append("    </rows>\n");
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
