package com.uking.mbpro.test;

import com.uking.mbpro.dao.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *测试dao层
 * @author huangl
 * 推荐spring的项目就用Spring的单元测试，可以自动注入我们需要的组件
 * 导入springTest模块
 * 指定spring配置文件的位置
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"WEB-INF/applicationContext.xml"})
public class MapperTest {

    @Autowired
    UserInfoMapper userInfoMapper;

//    @Test
//    public void usermapper() throws Exception {
//        //1.创建springIOC容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.从容器中获取mapper
//        UserInfoMapper userMapper = ioc.getBean(UserInfoMapper.class);
//        System.out.println(userInfoMapper);
//
//        userMapper.insert(new UserInfo(null,"测试"));
//    }

    @Test
    public void testMapper() throws Exception {
        //1.创建springIOC容器
        //ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取mapper
        //UserInfoMapper userMapper = ioc.getBean(UserInfoMapper.class);

        System.out.println(userInfoMapper);

//        userInfoMapper.insert(new UserInfo(null,"测试"));
    }





}
