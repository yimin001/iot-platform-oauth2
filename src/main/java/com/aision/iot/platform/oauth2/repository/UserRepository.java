package com.aision.iot.platform.oauth2.repository;

import com.aision.iot.platform.oauth2.entity.UserEntity;
import com.aision.iot.platform.parent.jpa.BaseRepository;

/**
 * @author yim
 * @description 用户UserRepository
 * @date 2019/5/6
 */
public interface UserRepository extends BaseRepository<UserEntity, String> {
    /**
     * 通过登录名查找用户
     * @param loginName
     * @return
     */
    UserEntity findByLoginName(String loginName);
}
