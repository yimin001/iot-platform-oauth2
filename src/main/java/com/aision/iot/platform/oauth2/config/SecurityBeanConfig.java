package com.aision.iot.platform.oauth2.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author yim
 * @description Security配置类
 * @date 2019/5/9
 */
@Configuration
@EnableCaching
public class SecurityBeanConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 使用官方默认的BCryptPasswordEncoder加密
        return new BCryptPasswordEncoder();
    }
}
