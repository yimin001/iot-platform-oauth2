package com.aision.iot.platform.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


/**
 * @author yim
 * @description 启动类
 * @date 2019/4/26
 */
@SpringBootApplication
@EnableAuthorizationServer
@ComponentScan(basePackages={"com.aision.iot.platform.parent.**","com.aision.iot.platform.oauth2.**"})
public class IotPlatformOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(IotPlatformOauth2Application.class, args);
    }

}
