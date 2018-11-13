package com.uking.mbpro.service;

import com.uking.mbpro.bean.UserInfo;

import java.util.Map;

public interface UserInfoService {

   UserInfo getUserInfo(String id);
   UserInfo  loginByEmployee(Map<String, Object> paramMap);
}
