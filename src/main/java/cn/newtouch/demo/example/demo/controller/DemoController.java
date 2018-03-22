package cn.newtouch.demo.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mumu
 * @vervion v1.0
 * @description
 * @date 2017/8/21 2017, 上午11:46
 */
@RestController
public class DemoController {

    @GetMapping("/demo/hello")
    public String getHello(){
        return "hello world! mumu";
    }
}
