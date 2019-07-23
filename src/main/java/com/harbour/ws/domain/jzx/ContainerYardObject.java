package com.harbour.ws.domain.jzx;

import java.io.Serializable;

//集装箱-堆场-详细信息
public class ContainerYardObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code; //对象编码
    private String mc;   //对象名称
    private String rate;   //使用率
    private String zrl;  //总容量
    private String syl;  //使用量
    private String sy;    //剩余量
    private String zx;    //重箱
    private String kx;    //空箱
    private String nm;    //内贸
    private String wm;    //外贸
    private String ck;    //出口
    private String jk;    //进口

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

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

    public String getZrl() {
        return zrl;
    }

    public void setZrl(String zrl) {
        this.zrl = zrl;
    }

    public String getSyl() {
        return syl;
    }

    public void setSyl(String syl) {
        this.syl = syl;
    }

    public String getSy() {
        return sy;
    }

    public void setSy(String sy) {
        this.sy = sy;
    }

    public String getZx() {
        return zx;
    }

    public void setZx(String zx) {
        this.zx = zx;
    }

    public String getKx() {
        return kx;
    }

    public void setKx(String kx) {
        this.kx = kx;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getWm() {
        return wm;
    }

    public void setWm(String wm) {
        this.wm = wm;
    }

    public String getCk() {
        return ck;
    }

    public void setCk(String ck) {
        this.ck = ck;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
}
