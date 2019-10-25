package com.dimple.project.monitor.mapper;

import com.dimple.project.monitor.domain.SysBlacklist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className: SysBlacklistMapper
 * @description:
 * @author: Dimpleb
 * @date: 10/24/19
 */
public interface SysBlacklistMapper {
    /**
     * 新增系统黑名单
     *
     * @param blacklist 黑名单对象
     */
    int insertBlacklist(SysBlacklist blacklist);

    /**
     * 查询系统黑命大集合
     *
     * @param sysBlacklist 黑名单对象
     * @return 黑名单集合
     */
    List<SysBlacklist> selectBlacklistList(SysBlacklist sysBlacklist);

    /**
     * 批量删除系统黑名单
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    int deleteBlacklistByIds(@Param("ids") String[] ids, @Param("deleteBy") String deleteBy);

    /**
     * 更新黑名单
     *
     * @param sysBlacklist 黑名单
     * @return 结果
     */
    int updateBlacklist(SysBlacklist sysBlacklist);

    /**
     * 根据id查询黑名单
     *
     * @param id id
     * @return 对象
     */
    SysBlacklist selectBlacklistById(@Param("id") Long id);

    /**
     * 插入黑名单记录
     *
     * @param id            id
     * @param lastAccessUrl accessUrl
     */
    void insertBlacklistRecord(@Param("id") Long id, @Param("lastAccessUrl") String lastAccessUrl);

}
