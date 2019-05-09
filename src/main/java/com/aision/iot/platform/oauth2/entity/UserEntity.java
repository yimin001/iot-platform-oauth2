package com.aision.iot.platform.oauth2.entity;

import com.aision.iot.platform.parent.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

/**
 * @author yim
 * @description 用户信息
 * @date 2019/5/6
 */
@Entity
@Table(name = "t_user_info", schema = "user_schema")
@Data
@ToString
public class UserEntity extends BaseEntity {

    @Column(name = "login_name")
    @ApiParam(name = "登录名", required = true)
    @NotBlank(message = "登录名不能为空")
    private String loginName;

    @Column(name = "login_password")
    @ApiParam(name = "登录密码", required = true)
    @NotBlank(message = "登录密码不能为空")
    private String loginPassword;

    @Column(name = "user_name")
    @ApiParam("用户名")
    private String userName;

    @Column(name = "email")
    @ApiParam("邮箱")
    private String email;

    @Column(name = "phone")
    @ApiParam("手机")
    private String phone;

    @Column(name = "user_status")
    @ApiParam("用户状态")
    private String userStatus;

}
