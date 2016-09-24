package com.web.test;

import com.web.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class SMtest {

//    static {
//       ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
//    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void delete(){
        userMapper.delete(2);
    }




}
