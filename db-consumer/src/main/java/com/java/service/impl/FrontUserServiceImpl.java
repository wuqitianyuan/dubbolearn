package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.common.service.GoodsService;
import com.java.service.FrontUserService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class FrontUserServiceImpl implements FrontUserService {

    @Reference(version = "1.0.0")
    private GoodsService goodsService;

    @Override
    public List<String> getUsers() {
        return goodsService.getUsers();
    }

    @Override
    public List<Map<String, Object>> getGoodsByConsumer() {
        return goodsService.getGoods();
    }
}
