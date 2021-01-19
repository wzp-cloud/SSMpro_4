package com.tledu.cn.controller;

import com.tledu.cn.pojo.Goods;
import com.tledu.cn.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsServiceimpl;


   // @RequestMapping(value = "/goodsSelect", consumes = "application/json")
    @ResponseBody
    private Goods goodsSelect(@RequestBody Goods g) throws IOException {

        goodsServiceimpl.queryAll(g);


        return new Goods();
    }
//    public int yanzheng(@RequestBody Goods g){
//
//        return 1;
//    }


    /**
     * HandlerName /goodsAdd
     *
     * @Description 商品添加方法，实现页面商品信息添加入库
     * params
     * goods 商品对象
     * @Author Gxp
     * @Date 2020/5/21
     * @Version 1.0
     **/
//    @RequestMapping(value = "/goodsAdd")
//    @ResponseBody
//    private Map<String, Object> goodsAdd2(Goods goods) throws IOException {
////                                         接受前端JSON对象字符串格式的数据注入
////    private Map<String,Object> goodsAdd2(@RequestBody Goods goods) throws IOException {
//
//        Map<String, Object> resultMap = new HashMap<String, Object>();
//        //handler 方法拿到数据后  调用业务类，实现数据添加到数据库
//        int result = goodsServiceimpl.addGoods(goods);
//
//        if (result > 0) {
//            System.out.println("商品增加成功！");
//            resultMap.put("code", 1);
//        } else {
//            System.out.println("商品增加失败！");
//            resultMap.put("code", 0);
//        }
//        return resultMap;
//    }
}
