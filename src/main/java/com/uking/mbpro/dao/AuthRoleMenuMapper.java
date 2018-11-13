package com.uking.mbpro.dao;

import com.uking.mbpro.bean.AuthRoleMenu;

public interface AuthRoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthRoleMenu record);

    int insertSelective(AuthRoleMenu record);

    AuthRoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthRoleMenu record);

    int updateByPrimaryKey(AuthRoleMenu record);
}