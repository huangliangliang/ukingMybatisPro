package com.uking.mbpro.dao;

import com.uking.mbpro.bean.AuthRoleMenu;
import com.uking.mbpro.bean.AuthRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthRoleMenuMapper {
    long countByExample(AuthRoleMenuExample example);

    int deleteByExample(AuthRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthRoleMenu record);

    int insertSelective(AuthRoleMenu record);

    List<AuthRoleMenu> selectByExample(AuthRoleMenuExample example);

    AuthRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthRoleMenu record, @Param("example") AuthRoleMenuExample example);

    int updateByExample(@Param("record") AuthRoleMenu record, @Param("example") AuthRoleMenuExample example);

    int updateByPrimaryKeySelective(AuthRoleMenu record);

    int updateByPrimaryKey(AuthRoleMenu record);
}