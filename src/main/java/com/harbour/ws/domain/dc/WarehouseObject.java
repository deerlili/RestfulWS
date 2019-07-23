package com.harbour.ws.domain.dc;

// 两江仓储-固定设施-仓库-详细信息
public class WarehouseObject {
    private static final long serialVersionUID = 1L;
    private String code; //对象编码
    private String mc;   //对象名称
    private String zkc;  //总库存


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

    public String getZkc() {
        return zkc;
    }

    public void setZkc(String zkc) {
        this.zkc = zkc;
    }

}
