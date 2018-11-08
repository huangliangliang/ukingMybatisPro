package com.uking.mbpro.controller;

import com.uking.mbpro.bean.UserInfo;
import com.uking.mbpro.service.UserInfoService;
import com.uking.mbpro.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/getUserInfoById")
    public String getUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo = userInfoService.getUserInfo("cgy8fba9-a425-11e8-815e-94c691809001");
        System.out.println(userInfo.toString());
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/queryAny", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=utf-8")
    public void queryAny(@RequestBody String param, HttpServletResponse response) throws Exception {
//        Map maps = JsonUtil.fromJsonToMap(param);
//        Map<String, Object> obj = performanceCycleService.queryAny(maps);
//        printWriterOut(response, obj);
        UserInfo userInfo = new UserInfo();
        userInfo = userInfoService.getUserInfo("cgy8fba9-a425-11e8-815e-94c691809001");
        System.out.println(userInfo.toString());
    }

    @ResponseBody
    @RequestMapping(value = "/loginByEmployee", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=utf-8")
    public void loginByEmployee(@RequestBody String param, HttpServletResponse response) throws Exception {
        Map maps = JsonUtil.fromJsonToMap(param);
//        Map<String, Object> obj = performanceCycleService.queryAny(maps);
//        printWriterOut(response, obj);
        UserInfo userInfo = userInfoService.loginByEmployee(maps.get("employee").toString());
        if(userInfo.getPassword() == maps.get("password")){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！");
            return;
        }
        System.out.println(userInfo.toString());
    }

}
