package com.harbour.ws.domain.jsh;

import java.io.Serializable;
//件散货-船舶-基本信息
public class NeobulkShip implements Serializable {
    private static final long serialVersionUID = 1L;
    private String rq;  //日期
    private String cmc; //船舶
    private String hc;  //航次
    private String bwmc;//泊位
    private String zt;  //状态
    private String bz;  //备注

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public String getHc() {
        return hc;
    }

    public void setHc(String hc) {
        this.hc = hc;
    }

    public String getBwmc() {
        return bwmc;
    }

    public void setBwmc(String bwmc) {
        this.bwmc = bwmc;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
