package com.aision.iot.platform.oauth2.entity;

import com.aision.iot.platform.parent.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author yim
 * @description 角色表
 * @date 2019/5/7
 */
@Table(name = "t_role_info")
@Data
@ToString
public class RoleEntity extends BaseEntity implements GrantedAuthority {
    /**
     * 角色名,英文用于系统权限判断
     */
    @Column(name = "role_name")
    private String roleName;
    /**
     * 说明
     */
    @Column(name = "remark")
    private String remark;

    @Override
    public String getAuthority() {
        return roleName;
    }
}
