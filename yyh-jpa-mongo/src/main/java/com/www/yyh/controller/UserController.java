package com.www.yyh.controller;

import com.www.yyh.annotation.Log;
import com.www.yyh.entity.User;
import com.www.yyh.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orgz/users")
public class UserController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Log("首页IndexController")
    @GetMapping()
    public List<User> getUserList() {
        LOGGER.trace("巴拉巴拉小魔仙");
        return userService.getUserList();
    }

    @GetMapping("/{id}")
    public User getUserBypersonNo(@PathVariable String personNo) {
        return userService.findByPersonNo(personNo);
    }

    @PostMapping()
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @PatchMapping("/{id}")
    public void patchUser(@PathVariable String id,String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.removeDemo(id);
    }
}
