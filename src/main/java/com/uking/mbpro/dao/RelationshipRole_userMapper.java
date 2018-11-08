package com.uking.mbpro.dao;

import com.uking.mbpro.bean.RelationshipRole_user;
import com.uking.mbpro.bean.RelationshipRole_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationshipRole_userMapper {
    long countByExample(RelationshipRole_userExample example);

    int deleteByExample(RelationshipRole_userExample example);

    int deleteByPrimaryKey(String id);

    int insert(RelationshipRole_user record);

    int insertSelective(RelationshipRole_user record);

    List<RelationshipRole_user> selectByExample(RelationshipRole_userExample example);

    RelationshipRole_user selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RelationshipRole_user record, @Param("example") RelationshipRole_userExample example);

    int updateByExample(@Param("record") RelationshipRole_user record, @Param("example") RelationshipRole_userExample example);

    int updateByPrimaryKeySelective(RelationshipRole_user record);

    int updateByPrimaryKey(RelationshipRole_user record);
}