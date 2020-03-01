package com.blog.core.service.impl;


import com.blog.core.dao.SysMenuDao;
import com.blog.core.entity.SysMenuEntity;
import com.blog.core.service.SysMenuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description 权限业务实现
 * @Author youcong
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {


    /**
     * 根据角色查询用户权限
     * @Author youcong
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    @Override
    public List<SysMenuEntity> selectSysMenuByRoleId(Long roleId) {
        return this.baseMapper.selectSysMenuByRoleId(roleId);
    }
}