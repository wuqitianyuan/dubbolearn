package com.java.service;

import java.util.List;
import java.util.Map;

public interface FrontUserService {
    List<String> getUsers();

    List<Map<String,Object>> getGoodsByConsumer();
}
