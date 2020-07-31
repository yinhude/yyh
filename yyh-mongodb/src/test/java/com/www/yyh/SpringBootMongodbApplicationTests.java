package com.www.yyh;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述: 单元测试
 *
 * @author zhaoyh
 * @create 2020-07-29 16:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMongodbApplication.class)
public class SpringBootMongodbApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void saveDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("xxxxxxxxx");
        demoEntity.setBy("xxxxxxxxx");
        demoEntity.setUrl("xxxxxxxxxm");

        demoDao.saveDemo(demoEntity);

        demoEntity.setId(2L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("xxxxxxxxx");
        demoEntity.setBy("xxxxxxxxx");
        demoEntity.setUrl("xxxxxxxxxm");

        demoDao.saveDemo(demoEntity);
    }

    @Test
    public void removeDemoTest() {
        demoDao.removeDemo(2L);
    }

    @Test
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB 更新数据");
        demoEntity.setDescription("xxxxxxxxx");
        demoEntity.setBy("xxxxxxxxx");
        demoEntity.setUrl("xxxxxxxxxm");

        demoDao.updateDemo(demoEntity);
    }

    @Test
    public void findDemoByIdTest() {

        DemoEntity demoEntity = demoDao.findDemoById(1L);

        System.out.println(JSONObject.toJSONString(demoEntity));
    }

}
