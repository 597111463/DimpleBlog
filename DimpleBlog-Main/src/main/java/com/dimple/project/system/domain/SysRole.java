package com.dimple.project.system.domain;

import com.dimple.framework.web.domain.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: SysRole
 * @description: 角色表 sys_role
 * @author: Dimple
 * @date: 10/22/19
 */
@Data
@NoArgsConstructor
public class SysRole extends BaseEntity {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色权限
     */
    private String roleKey;

    /**
     * 角色排序
     */
    private String roleSort;

    /**
     * 角色状态（0正常 1停用）
     */
    private String status;

    /**
     * 用户是否存在此角色标识 默认不存在
     */
    private boolean flag = false;

    /**
     * 菜单组
     */
    private Long[] menuIds;


    public SysRole(Long roleId) {
        this.roleId = roleId;
    }

    public static boolean isAdmin(Long roleId) {
        return roleId != null && 1L == roleId;
    }

    public boolean isAdmin() {
        return isAdmin(this.roleId);
    }
}
