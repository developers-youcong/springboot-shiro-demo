package com.blog.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.core.entity.SysUserEntity;

/**
 * @Description 系统用户业务接口
 * @Author youcong
 */
public interface SysUserService extends IService<SysUserEntity> {

    /**
     * 根据用户名查询实体
     * @Author youcong
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUserEntity selectUserByName(String username);

}

