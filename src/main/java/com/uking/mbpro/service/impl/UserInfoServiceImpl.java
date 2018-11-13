package com.uking.mbpro.service.impl;

import com.uking.mbpro.bean.UserInfo;
import com.uking.mbpro.dao.UserInfoMapper;
import com.uking.mbpro.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(String id) {

        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserInfo loginByEmployee(Map<String, Object> paramMap) {
        return userInfoMapper.loginByEmployee(paramMap);
    }
}
