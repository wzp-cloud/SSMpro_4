package com.tledu.cn.dao;

import com.tledu.cn.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//mybatis 为了被Spring接管，设定的注解，功能，就是将Mapper代理接口，实例化称对象，并交给Spring接管
public interface GoodsMapper {

    Goods queryAll(Goods goods);
    //int addGoods(Goods goods);
}
