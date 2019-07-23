package com.harbour.ws.domain.cc;

public class WarehouseProductionSum {
    private static final long serialVersionUID = 1L;
    private String type;  //类型：出库,入库
    private Double mm;    //月统计出入库量
    private Double dd;    //日统计出入库量

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMm() {
        return mm;
    }

    public void setMm(Double mm) {
        this.mm = mm;
    }

    public Double getDd() {
        return dd;
    }

    public void setDd(Double dd) {
        this.dd = dd;
    }
}
