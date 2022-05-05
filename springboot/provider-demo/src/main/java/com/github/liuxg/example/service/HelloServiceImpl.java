package com.github.liuxg.example.service;

import com.github.liuxg.example.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author xinguai.liu
 */
@DubboService
@Slf4j
public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl() {
        System.out.println("==============HelloServiceImpl=========");
    }

    @Override
    public String sayHello(String name) {
        log.info("provider received invoke of sayHello: {}", name);
        return "hello " + name;
    }
}
