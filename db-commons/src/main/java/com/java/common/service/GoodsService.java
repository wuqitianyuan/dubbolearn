package com.java.common.service;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<String> getUsers();

    List<Map<String,Object>> getGoods();
}
