package com.blog.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blog.core.dao.SysUserDao;
import com.blog.core.entity.SysUserEntity;
import com.blog.core.service.SysUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description 系统用户业务实现
 * @Author youcong
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    /**
     * 根据用户名查询实体
     * @Author youcong
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    @Override
    public SysUserEntity selectUserByName(String username) {
        QueryWrapper<SysUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUserEntity::getUsername,username);
        return this.baseMapper.selectOne(queryWrapper);
    }
}