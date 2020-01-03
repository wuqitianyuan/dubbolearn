package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.common.service.GoodsService;
import com.java.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service(version="1.0.0")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public List<String> getUsers() {
        return Arrays.asList("it's provider two:","Chinese","United Kindom", "Japanese");
    }

    @Override
    public List<Map<String, Object>> getGoods() {
        return goodsMapper.selectGoods();
    }
}
