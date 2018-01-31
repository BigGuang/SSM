package com.waps.obj2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.waps.obj2.domain.User;
import com.waps.obj2.service.UserService;

public class TestSpring {

    @Test
    public void TestUserService() throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userService");
        User user=new User();
        user.setId(9529);
        user.setAge(1);
        user.setUserName("zhangsan");
        user.setPassword("123456");
        user.setTrueName("张三");
        user.setEmail("jxg@com.waps.cn");
        user.setPhone("13810889527");
        user.setRoleName("manager");
        userService.add(user);

        userService.getAll();
    }

}
