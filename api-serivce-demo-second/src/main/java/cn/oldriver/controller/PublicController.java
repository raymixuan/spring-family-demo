package cn.oldriver.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kejx
 * @Date 2019/3/13 0:35
 */
@RestController
@RequestMapping("/api/v1/demo")
public class PublicController {


    @RequestMapping(method = RequestMethod.GET,
    path = "/{content}/each")
    public String eachTest(@PathVariable("content") String content) {

        return "hello " + content + " :)" +
                "\n that 02 api-service";

    }

}
