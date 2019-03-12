package cn.oldriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author kejx
 * @Date 2019/3/13 1:16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ThirdlyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdlyServiceApplication.class, args);
    }

}
