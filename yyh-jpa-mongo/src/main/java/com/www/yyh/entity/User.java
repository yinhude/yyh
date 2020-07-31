package com.www.yyh.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "user")
public class User {
    /**
     * @Document 定义 mongoDB 文档名称
     * @Indexed 创建索引
     * <p>
     * unique = true 创建唯一索引
     * <p>
     * background = true 后台创建索引
     * <p>
     * expireAfterSeconds = 10 * 60 设置600秒过期时间(默认秒，到期便会自动删除该条数据)
     */


    @Id
    private String id;

    @Indexed(unique = true, background = true)
    private String personNo;

    private String name;

    private int age;

    private Long memberId;
    @Indexed(background = true, expireAfterSeconds = 10 * 60)
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User(String id, String personNo, String name, int age, Long memberId, Date createTime) {
        this.id = id;
        this.personNo = personNo;
        this.name = name;
        this.age = age;
        this.memberId = memberId;
        this.createTime = createTime;
    }

    public User() {
    }
}
