package com.uking.mbpro.dao;

import com.uking.mbpro.bean.PermissionDetail;

public interface PermissionDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(PermissionDetail record);

    int insertSelective(PermissionDetail record);

    PermissionDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PermissionDetail record);

    int updateByPrimaryKey(PermissionDetail record);
}