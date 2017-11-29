package com.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/9/28
 * Time: 14:25
 * Description:
 */
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate; // HTTP 访问操作类

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return restTemplate.getForEntity("http://HI-PROVIDER/provider",
                String.class).getBody();
    }

    public String hiError() {
        return "hi,sorry,error!";
    }
}
