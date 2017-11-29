package com.fegin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/11/29
 * Time: 15:08
 * Description:
 */
@FeignClient(value = "HI-PROVIDER")
public interface FeginHiService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);
}
