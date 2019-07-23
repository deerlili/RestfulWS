package com.harbour.ws.domain.jzx;

import java.io.Serializable;

// 集装箱-泊位明细信息
public class ContainerSearch implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;     // 对象名称
    private String mc;     // 对象名称

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
}
