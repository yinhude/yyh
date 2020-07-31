package com.www.yyh.service;

import com.www.yyh.entity.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUserList();

    User findByPersonNo(@Param("personNo") String personNo);

    void save(User user);

    void removeDemo(Long id);

    void update(User user);
}
