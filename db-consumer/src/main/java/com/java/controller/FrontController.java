package com.java.controller;

import com.java.service.FrontUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class FrontController {
    @Autowired
    private FrontUserService frontUserService;

    @RequestMapping("/getLists.do")
    public @ResponseBody List<String> getList(){
        return frontUserService.getUsers();
    }

    @RequestMapping("/getGoods")
    public @ResponseBody List<Map<String,Object>> getGoods(){
        return frontUserService.getGoodsByConsumer();
    }
}
