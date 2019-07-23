package com.harbour.ws.domain.jzx;

import java.io.Serializable;
//集装箱-岸桥
public class QuayCraneObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;   //对象编码
    private String mc;     //对象名称
    private String zt;     //状态
    private String zynr;   //作业内容

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

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getZynr() {
        return zynr;
    }

    public void setZynr(String zynr) {
        this.zynr = zynr;
    }
}
