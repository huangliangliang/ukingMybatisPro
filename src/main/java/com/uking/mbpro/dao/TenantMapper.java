package com.uking.mbpro.dao;

import com.uking.mbpro.bean.Tenant;

public interface TenantMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tenant record);

    int insertSelective(Tenant record);

    Tenant selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tenant record);

    int updateByPrimaryKey(Tenant record);
}