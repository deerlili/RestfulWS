package com.harbour.ws.domain.jsh;

import java.io.Serializable;
// 件散货-泊位-详细信心
public class NeobulkBerthObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;   //对象编码
    private String mc;     //对象名称
    private String zt;     //状态
    private String cmc;    //船名称
    private String hc;     //航次
    private String cbgs;   //船舶公司
    private String rgsj;   //入港时间
    private String kbsj;   //靠泊时间
    private String jhkbsj; //计划靠泊时间
    private String zykssj; //作业开始时间
    private String zyjssj; //作业结束时间

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getCbgs() {
        return cbgs;
    }

    public void setCbgs(String cbgs) {
        this.cbgs = cbgs;
    }

    public String getRgsj() {
        return rgsj;
    }

    public void setRgsj(String rgsj) {
        this.rgsj = rgsj;
    }

    public String getKbsj() {
        return kbsj;
    }

    public void setKbsj(String kbsj) {
        this.kbsj = kbsj;
    }

    public String getJhkbsj() {
        return jhkbsj;
    }

    public void setJhkbsj(String jhkbsj) {
        this.jhkbsj = jhkbsj;
    }

    public String getZykssj() {
        return zykssj;
    }

    public void setZykssj(String zykssj) {
        this.zykssj = zykssj;
    }

    public String getZyjssj() {
        return zyjssj;
    }

    public void setZyjssj(String zyjssj) {
        this.zyjssj = zyjssj;
    }
}
