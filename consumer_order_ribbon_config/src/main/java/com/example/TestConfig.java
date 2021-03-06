package com.example;

import com.example.springCloud.ExcludeCommonScan;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeCommonScan
public class TestConfig {
    @Autowired
    IClientConfig iClientConfig;
    /**
     * 创建负载均衡算法
     * @param config
     * @return
     */
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();

    }

}
