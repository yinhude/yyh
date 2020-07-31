package com.www.yyh;

/**
 * 描述: 提供增删改查 MongoDB 接口
 *
 * @author zhaoyh
 * @create 2020-07-29 16:29
 **/
public interface DemoDao {

    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
