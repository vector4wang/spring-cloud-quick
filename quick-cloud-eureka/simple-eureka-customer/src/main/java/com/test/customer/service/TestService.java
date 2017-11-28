package com.test.customer.service;

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

    public String hiService() {
        return restTemplate.getForEntity("http://TEST-PROVIDER/provider",
                String.class).getBody();
    }
}
