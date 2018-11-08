package com.uking.mbpro.dao;

import com.uking.mbpro.bean.PermissionDetail;
import com.uking.mbpro.bean.PermissionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionDetailMapper {
    long countByExample(PermissionDetailExample example);

    int deleteByExample(PermissionDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(PermissionDetail record);

    int insertSelective(PermissionDetail record);

    List<PermissionDetail> selectByExample(PermissionDetailExample example);

    PermissionDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PermissionDetail record, @Param("example") PermissionDetailExample example);

    int updateByExample(@Param("record") PermissionDetail record, @Param("example") PermissionDetailExample example);

    int updateByPrimaryKeySelective(PermissionDetail record);

    int updateByPrimaryKey(PermissionDetail record);
}