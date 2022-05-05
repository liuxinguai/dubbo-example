package com.github.liuxg.example;

import com.github.liuxg.example.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author xinguai.liu
 */
@RequestMapping("hello")
@RestController
public class HelloController {

    @DubboReference
    private HelloService helloService;


    @GetMapping("/get/{message}")
    public String sayHello(@PathVariable("message") String message) {
        return helloService.sayHello(message);
    }

}
