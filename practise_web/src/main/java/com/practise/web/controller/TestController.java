package com.practise.web.controller;

import com.practise.common.service.TestServiceIface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestServiceIface testServiceIface;
    @RequestMapping("/index")
    public String index(){
        return testServiceIface.index("XXXPPP");
    }
}
