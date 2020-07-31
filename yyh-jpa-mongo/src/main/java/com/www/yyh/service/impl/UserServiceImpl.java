package com.www.yyh.service.impl;

import com.www.yyh.dao.UserRepository;
import com.www.yyh.entity.User;
import com.www.yyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findByPersonNo(String personNo) {
        return userRepository.findByPersonNo(personNo);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void removeDemo(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update();
        update.set("person_no", user.getPersonNo());
        update.set("name", user.getName());
        update.set("member_id", user.getMemberId());
        update.set("age", user.getAge());
        update.set("create_time", user.getCreateTime());
        mongoTemplate.updateFirst(query, update, User.class);
    }

}
