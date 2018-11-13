package com.uking.mbpro.dao;

import com.uking.mbpro.bean.RoleGroup;

public interface RoleGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleGroup record);

    int insertSelective(RoleGroup record);

    RoleGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleGroup record);

    int updateByPrimaryKey(RoleGroup record);
}