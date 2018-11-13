package com.uking.mbpro.dao;

import com.uking.mbpro.bean.RelationshipRole_user;

public interface RelationshipRole_userMapper {
    int deleteByPrimaryKey(String id);

    int insert(RelationshipRole_user record);

    int insertSelective(RelationshipRole_user record);

    RelationshipRole_user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RelationshipRole_user record);

    int updateByPrimaryKey(RelationshipRole_user record);
}