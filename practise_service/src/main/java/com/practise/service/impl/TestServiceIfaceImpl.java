package com.practise.service.impl;

import com.practise.common.service.TestServiceIface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceIfaceImpl implements TestServiceIface {
    @Override
    public String index(String testStr) {
        System.err.println("测试成功");
        return "请求参数:"+testStr;
    }
}
