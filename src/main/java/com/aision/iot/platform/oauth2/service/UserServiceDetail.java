package com.aision.iot.platform.oauth2.service;

import com.aision.iot.platform.oauth2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author yim
 * @description 用户设置
 * @date 2019/5/7
 */
//@Service
//public class UserServiceDetail implements UserDetailsService{
//    @Autowired
//    private UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
//        return userRepository.findByLoginName(loginName);
//    }
//}
