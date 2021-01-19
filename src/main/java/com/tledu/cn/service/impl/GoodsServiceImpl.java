package com.tledu.cn.service.impl;

import com.tledu.cn.dao.GoodsMapper;
import com.tledu.cn.pojo.Goods;
import com.tledu.cn.service.GoodsService;
//import com.tledu.cn.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/*
* 普通接管@Component
* handler接管@Controller
* 业务类接管@Service  带事务
*
* */
//Goods操作业务类
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods queryAll(Goods g) {
        Goods goods = goodsMapper.queryAll(g);
        System.out.println(goods);

        return goods;
    }

//    @Override
//    public int addGoods(Goods goods) {
//        if(goods!=null){
//            goods.setId(UUID.randomUUID().toString());
//           // goods.setCreateTime(DateFormatUtil.date2String(new Date()));
//            return goodsMapper.addGoods(goods);
//        }else{
//            return 0;
//        }
//
//    }
}
