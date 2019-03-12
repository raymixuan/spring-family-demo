package cn.oldriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author kejx
 * @Date 2019/3/13 0:30
 */
@SpringBootApplication
@EnableEurekaClient
public class FirstDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstDemoServiceApplication.class, args);
    }

}
