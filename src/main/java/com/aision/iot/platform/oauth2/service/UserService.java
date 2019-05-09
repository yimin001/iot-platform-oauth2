package com.aision.iot.platform.oauth2.service;

import com.aision.iot.platform.oauth2.entity.UserEntity;
import com.aision.iot.platform.oauth2.repository.UserRepository;
import com.aision.iot.platform.parent.jpa.BaseRepository;
import com.aision.iot.platform.parent.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author yim
 * @description 用户serviece类
 * @date 2019/5/9
 */
@Service
public class UserService extends BaseService<UserEntity, String> {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    protected BaseRepository<UserEntity, String> initBaseRepository() {
        return userRepository;
    }

    /**
     * 用户注册服务
     * @param entity 用户实体
     * @return 是否注册成功 TRUE-成功,FALSE-失败
     */
    public Boolean registered(UserEntity entity){
        if (isLoginNameRepeat(entity.getLoginName())){
            return Boolean.FALSE;
        }
        entity.setLoginPassword(passwordEncoder.encode(entity.getLoginPassword()));
        userRepository.save(entity);
        return Boolean.TRUE;
    }

    /**
     * 判断登录名是否重复
     * @param loginName 登录名
     * @return TRUE-重复, FALSE不重复
     */
    public Boolean isLoginNameRepeat(String loginName){
        UserEntity entity = userRepository.findByLoginName(loginName);
        if (entity != null && !StringUtils.isEmpty(entity.getLoginName())){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }
}
