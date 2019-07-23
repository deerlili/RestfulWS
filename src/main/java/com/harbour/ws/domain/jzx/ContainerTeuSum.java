package com.harbour.ws.domain.jzx;

import java.io.Serializable;

// 集装箱吞吐量
public class ContainerTeuSum implements Serializable {
    private static final long serialVersionUID = 1L;
    private int teuSum; //集装箱吞吐量

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTeuSum() {
        return teuSum;
    }

    public void setTeuSum(int teuSum) {
        this.teuSum = teuSum;
    }
}
