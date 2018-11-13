package com.uking.mbpro.controller;

import com.uking.mbpro.bean.UserInfo;
import com.uking.mbpro.service.UserInfoService;
import com.uking.mbpro.util.JsonUtil;
import com.uking.mbpro.util.MessageException;
import com.uking.mbpro.util.ResultFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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
    public String loginByEmployee(@RequestBody String param, HttpServletResponse response, Model model) throws Exception {
        Map maps = JsonUtil.fromJsonToMap(param);

        ModelAndView modelAndView = new ModelAndView();
        UserInfo userInfo = userInfoService.loginByEmployee(maps);
        System.out.println(userInfo.toString());
        if(userInfo != null){
            System.out.println("登录成功！");

        }else {
            System.out.println("登录失败！");
            return null;
        }

//        printWriterOut(response,userInfo.toString());
//        modelAndView.setViewName("/test");
        return "/test";
    }

    /**
     * 首页登录方法 -- 登录成功进行页面跳转
     */
    @RequestMapping(value = "/do")
    public String login(Model model,String acc_name, String password, HttpSession session)throws Exception {

        Map map = new HashMap();
        map.put("employeeNo",acc_name);
        map.put("password",password);
        UserInfo userInfo = userInfoService.loginByEmployee(map);
        if(userInfo != null){
            System.out.println("登录成功！");

        }else {
            System.out.println("登录失败！");
            return null;
        }
        return "/views/home";
    }

        /**
         * description: 操作响应信息
         * param: [response, data]
         * return: void
         * auther: s1203017
         * date: 2018/8/7 10:11
         */
    public void printWriterOut(HttpServletResponse response, Object data) throws MessageException {
        try {
            System.out.println("data:" + data);
            ResultFormat resultFormat = ResultFormat.build(200, "SUCCESS");
            if (StringUtils.isEmpty(data) || data.toString().length() == 0) {
                resultFormat.setResultCode(204);
                resultFormat.setResultMessage("No Content");
            }
            System.out.println("data:" + data);
            resultFormat.setResultData(data);
            String result = JsonUtil.toJson(resultFormat, false);
            System.out.println("result:" + result);
            response.setContentType("text/html;charset=UTF-8");
            response.setCharacterEncoding("utf-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.print(result);
            printWriter.flush();
        } catch (IOException e) {
            throw new MessageException("error");
        }
    }


}
