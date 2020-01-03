package com.java.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.common.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetController {
    @Reference
    private GoodsService goodsService;

    @RequestMapping("/getList.do")
    public @ResponseBody List<String> getUsers(){
        return goodsService.getUsers();
    }
}
