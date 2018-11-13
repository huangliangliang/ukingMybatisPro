package com.uking.mbpro.dao;

import com.uking.mbpro.bean.PermissionSetting;

public interface PermissionSettingMapper {
    int deleteByPrimaryKey(String id);

    int insert(PermissionSetting record);

    int insertSelective(PermissionSetting record);

    PermissionSetting selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PermissionSetting record);

    int updateByPrimaryKey(PermissionSetting record);
}