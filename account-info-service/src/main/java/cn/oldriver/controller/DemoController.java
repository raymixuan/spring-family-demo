package cn.oldriver.controller;

import cn.oldriver.service.RemoteApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kejx
 * @Date 2019/3/13 1:31
 */
@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @Autowired
    private RemoteApiService service;

    @RequestMapping("/hello")
    public String each() {
        return "by thirdly service : " + service.hello();
    }

}
