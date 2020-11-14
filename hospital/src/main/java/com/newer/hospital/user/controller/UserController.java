package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.User;
import com.newer.hospital.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2020年11月12日 10:47:00
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/login/{user}", method = RequestMethod.POST)
    public Integer login(@PathVariable User user) {
        return userService.login(user);
    }


    /**
     * 根据id获取用户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User userById(@PathVariable Integer id) {
        return userService.userById(id);
    }

    /**
     * 获取全部用户
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> allUser() {
        return userService.allUser();
    }
}
