package com.harbour.ws.domain.jzx;

import java.io.Serializable;

// 集装箱-泊位动态-table2
public class ContainerBerthTrends implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dt; //动态
    private String mc; //
    private String cmc;
    private String zxlb;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


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
}
