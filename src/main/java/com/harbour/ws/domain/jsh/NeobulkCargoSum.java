package com.harbour.ws.domain.jsh;

import java.io.Serializable;

//货物吞吐量
public class NeobulkCargoSum implements Serializable {
    private static final long serialVersionUID = 1L;
    private Double zl; //货物吞吐量

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Double getZl() {
        return zl;
    }

    public void setZl(Double zl) {
        this.zl = zl;
    }
}
