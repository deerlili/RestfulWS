package com.harbour.ws.domain.jsh;

import java.io.Serializable;

//件散货-堆场-基本信息
public class NeobulkYard implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code; //对象编码
    private String mc;   //对象名称
    private String hwlx; //货物类型
    private String ds;   //吨数

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getHwlx() {
        return hwlx;
    }

    public void setHwlx(String hwlx) {
        this.hwlx = hwlx;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }
}
