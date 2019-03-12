package cn.oldriver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kejx
 */
@FeignClient("api-service-demo-first")
public interface RemoteApiService {

    /**
     * 调用其余测试服务中接口
     * @return 测试字符串
     */
    @RequestMapping(value = "/api/v1/demo/word/each",method = RequestMethod.GET)
    String hello();
}
