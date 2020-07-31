package com.www.yyh;

import com.www.yyh.entity.User;
import com.www.yyh.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YyhJpaApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void save() {
        String personNo = "12341234";
        String name = "张三";
        User user = new User("123",personNo,name,18,371723771737737177L,new Date());
        userService.save(user);
        System.out.println(System.currentTimeMillis()+ "保存人员方法结束");

        User us = userService.findByPersonNo(personNo);

        Assert.assertEquals(name,us.getName());
    }

}
