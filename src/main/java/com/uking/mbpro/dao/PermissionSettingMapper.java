package com.uking.mbpro.dao;

import com.uking.mbpro.bean.PermissionSetting;
import com.uking.mbpro.bean.PermissionSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionSettingMapper {
    long countByExample(PermissionSettingExample example);

    int deleteByExample(PermissionSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(PermissionSetting record);

    int insertSelective(PermissionSetting record);

    List<PermissionSetting> selectByExample(PermissionSettingExample example);

    PermissionSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PermissionSetting record, @Param("example") PermissionSettingExample example);

    int updateByExample(@Param("record") PermissionSetting record, @Param("example") PermissionSettingExample example);

    int updateByPrimaryKeySelective(PermissionSetting record);

    int updateByPrimaryKey(PermissionSetting record);
}