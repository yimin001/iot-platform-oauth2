package com.aision.iot.platform.oauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * @author yim
 * @description 单点登录设置
 * @date 2019/5/7
 */
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;
    /**
     * 服务端端点配置 在服务器端点配置主要配置三点：
     * 1.认证管理器 2.用户信息 3.token的存储管理
     */


}
