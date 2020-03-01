package com.blog.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.core.entity.SysMenuEntity;

import java.util.List;

/**
 * @Description 权限业务接口
 * @Author youcong
 */
public interface SysMenuService extends IService<SysMenuEntity> {
    
    
    /**
     * 根据角色查询用户权限
     * @Author youcong
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);

}

