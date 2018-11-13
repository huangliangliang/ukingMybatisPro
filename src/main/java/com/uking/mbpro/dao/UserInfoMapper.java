package com.uking.mbpro.dao;

import com.uking.mbpro.bean.UserInfo;

import java.util.Map;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo  loginByEmployee(Map<String, Object> paramMap);
}