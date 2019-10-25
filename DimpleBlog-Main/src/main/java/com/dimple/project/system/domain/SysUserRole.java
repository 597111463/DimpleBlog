package com.dimple.project.system.domain;

import lombok.Data;

/**
 * @className: SysUserRole
 * @description: 用户和角色关联 sys_user_role
 * @author: Dimple
 * @date: 10/22/19
 */
@Data
public class SysUserRole {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}
