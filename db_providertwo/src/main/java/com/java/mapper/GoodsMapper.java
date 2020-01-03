package com.java.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    @Select("select gd.*, gs.name as sortName from goods_detail gd inner join goods_sort gs on gd.sortId=gs.id")
    List<Map<String,Object>> selectGoods();
}
