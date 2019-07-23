package com.harbour.ws.domain.cc;

public class WarehouseDynamic {
    private static final long serialVersionUID = 1L;
    private String ck;  //仓库
    private String hwzl;//货物种类
    private Double hz;  //货重

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCk() {
        return ck;
    }

    public void setCk(String ck) {
        this.ck = ck;
    }

    public String getHwzl() {
        return hwzl;
    }

    public void setHwzl(String hwzl) {
        this.hwzl = hwzl;
    }

    public Double getHz() {
        return hz;
    }

    public void setHz(Double hz) {
        this.hz = hz;
    }
}
