package com.practise.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="server")
@RequestMapping("/testServiceIface")
public interface TestServiceIface {
    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String index(@RequestParam("testStr") String testStr);
}
