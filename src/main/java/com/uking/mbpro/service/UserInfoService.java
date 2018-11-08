package com.uking.mbpro.service;

import com.uking.mbpro.bean.UserInfo;

public interface UserInfoService {

   UserInfo  getUserInfo(String id);
   UserInfo  loginByEmployee(String employee_no);
}
