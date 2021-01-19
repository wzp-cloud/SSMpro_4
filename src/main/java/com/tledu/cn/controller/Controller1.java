package com.tledu.cn.controller;

import com.tledu.cn.pojo.Goods;
import com.tledu.cn.pojo.User;
import com.tledu.cn.service.GoodsService;
import com.tledu.cn.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
public class Controller1 {
    @RequestMapping("/login1")
    @ResponseBody
    public int login(@RequestBody User u){
        int mark=0;
        System.out.println(u);
        if ((u.getAcc()!=null)){
            if ((6<u.getAcc().length())&&(u.getAcc().length()<10)){
                if ((1<u.getPwd().length())&&(u.getPwd().length()<5)){

                    mark=1;

                }

            }
        }else{
            mark=0;
        }
        return mark;
    }

    @Autowired
    private GoodsServiceImpl goodsServiceimpl;


    @RequestMapping("/goodsSelect")
    @ResponseBody
    private Goods goodsSelect(@RequestBody Goods g) throws IOException {

        System.out.println(g);
        Goods goods = goodsServiceimpl.queryAll(g);
        System.out.println(goods);

        return goods;

    }
}
