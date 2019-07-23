package com.harbour.ws.domain.cc;

// 两江仓储-固定设施-仓库-详细信息
public class WarehouseObject {
    private static final long serialVersionUID = 1L;
    private String code; //对象编码
    private String mc;   //对象名称
    private String zkc;  //总库存
    private String bc;   //板材
    private String xc;   //型材
    private String jc;   //建材
    private String yg;   //优钢
    private String jcl;   //卷材
    private String gc;   //管材
    private String ysjs;   //有色金属
    private String rqb;   //容器板
    private String qt;   //其它

    public String getYsjs() {
        return ysjs;
    }

    public void setYsjs(String ysjs) {
        this.ysjs = ysjs;
    }

    public String getRqb() {
        return rqb;
    }

    public void setRqb(String rqb) {
        this.rqb = rqb;
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt;
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

    public String getZkc() {
        return zkc;
    }

    public void setZkc(String zkc) {
        this.zkc = zkc;
    }

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
        this.bc = bc;
    }

    public String getXc() {
        return xc;
    }

    public void setXc(String xc) {
        this.xc = xc;
    }

    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc;
    }

    public String getYg() {
        return yg;
    }

    public void setYg(String yg) {
        this.yg = yg;
    }

    public String getJcl() {
        return jcl;
    }

    public void setJcl(String jcl) {
        this.jcl = jcl;
    }

    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }
}
