package com.github.liuxg.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xinguai.liu
 */
@EnableDubbo(scanBasePackages = "com.github.liuxg.example.service")
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class,args);

    }
}
