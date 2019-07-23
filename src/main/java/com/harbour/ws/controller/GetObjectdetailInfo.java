package com.harbour.ws.controller;

import com.harbour.ws.domain.jsh.NeobulkShip;
import com.harbour.ws.domain.jzx.*;
import com.harbour.ws.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 获取某一具体对象详细信息
@RestController
public class GetObjectdetailInfo {

    @Autowired // 集装箱-固定设施-泊位-S01
    private ContainerBerthObjectService containerBerthObjectService;
    @Autowired // 集装箱-移动设施-船舶-Y10
    private ContainerShipService containerShipService;
    @Autowired // 集装箱-固定设施-堆场-S02
    private ContainerYardObjectService containerYardObjectService;
    @Autowired // 集装箱-固定机械-岸桥-J01
    private QuayCraneObjectService quayCraneObjectService;
    @Autowired // 集装箱-固定机械-场桥-J02
    private YardCraneObjectService yardCraneObjectService;

    @Autowired // 件散货-固定设施-泊位-S01
    private NeobulkBerthObjectService neobulkBerthObjectService;
    @Autowired // 件散货-移动设施-船舶-Y10
    private NeobulkShipService neobulkShipService;

    @Autowired // 两江仓储-固定设施-仓库-S04
    private WarehouseObjectService warehouseObjectService;

    @GetMapping("/getObjectdetailInfo")
    public String getObjectdetailInfoInfo(@RequestParam String id) {

        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        sb.append("<Data>\n");
        sb.append("  <tableList>\n");

        if (id.contains("JZX-Y")) {
            //集装箱-移动对象
            if(id.contains("JZX-Y01")) {
                //人员
            } else if (id.contains("JZX-Y02")){
                //集卡
            } else if (id.contains("JZX-Y03")){
                //正面吊
            } else if (id.contains("JZX-Y04")){
                //叉车
            } else if (id.contains("JZX-Y05")){
                //商品车
            } else if (id.contains("JZX-Y06")){
                //货车
            } else if (id.contains("JZX-Y07")){
                //堆取料机
            } else if (id.contains("JZX-Y08")){
                //装车机
            } else if (id.contains("JZX-Y10")){
                //船舶
            }
        } else if (id.contains("JZX-J")){
            //集装箱-固定机械
            if(id.contains("JZX-J01")) {
                //岸桥
            } else if (id.contains("JZX-J02")){
                //场桥
            }  else if (id.contains("JZX-J04")){
                //装载机
            } else if (id.contains("JZX-J05")){
                //翻车机
            } else if (id.contains("JZX-J06")){
                //装船机
            } else if (id.contains("JZX-J07")){
                //铁路作业线
            } else if (id.contains("JZX-J08")){
                //行车
            } else if (id.contains("JZX-J09")){
                //门机
            }
        } else if(id.contains("JZX-S")) {
            //集装箱-固定设施
            if(id.contains("JZX-S01")) {
                //集装箱-固定设施-泊位
            } else if (id.contains("JZX-S02")){
                //堆场
            } else if (id.contains("JZX-S03")){
                //停车场
            } else if (id.contains("JZX-S04")){
                //仓库
            } else if (id.contains("JZX-S05")){
                //闸口
            } else if (id.contains("JZX-S06")){
                //视频监控
            }
        } else if(id.contains("JSH-Y")) {
            //件散货-移动对象
            if (id.contains("JSH-Y10")) {
                //船舶
            }
        } else if(id.contains("JSH-J")) {
            //件散货-固定机械
        } else if(id.contains("JSH-S")) {
            //件散货-固定设施
            if (id.contains("JSH-S01")) {
                //岸桥
            } else if (id.contains("JSH-S02")) {
                //堆场
            }
        } else if(id.contains("GZC-Y")) {
            //滚装车-移动对象
        } else if(id.contains("GZC-J")) {
            //滚装车-固定机械
        } else if(id.contains("GZC-S")) {
            //滚装车-固定设施
        } else if(id.contains("CC-Y")) {
            //两江仓储-移动对象
        } else if(id.contains("CC-J")) {
            //两江仓储-固定机械
        } else if(id.contains("CC-S")) {
            //两江仓储-固定设施
            if(id.contains("CC-S04")) {
                //仓库
            }
        } else if(id.contains("TL-Y")) {
            //铁路-移动对象
        } else if(id.contains("CC-J")) {
            //铁路-固定机械
        } else if(id.contains("CC-S")) {
            //铁路-固定设施
        }
        sb.append("  </tableList>\n");
        sb.append("</Data>\n");
        return sb.toString();
    }
}
