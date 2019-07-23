package com.harbour.ws.domain.jsh;

import java.io.Serializable;

//件散货-
public class NeobulkBerthTrends implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dt; //动态
    private String mc; //泊位
    private String cmc; //船名
    private String zxlb; //
    private String hwzl;  //
    private String code; //对象编码

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public String getZxlb() {
        return zxlb;
    }

    public void setZxlb(String zxlb) {
        this.zxlb = zxlb;
    }

    public String getHwzl() {
        return hwzl;
    }

    public void setHwzl(String hwzl) {
        this.hwzl = hwzl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

