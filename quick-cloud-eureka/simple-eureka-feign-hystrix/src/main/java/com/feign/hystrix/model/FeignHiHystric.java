package com.feign.hystrix.model;

import com.feign.hystrix.service.FeignHiService;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/11/29
 * Time: 16:52
 * Description:
 */
@Component
public class FeignHiHystric implements FeignHiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
