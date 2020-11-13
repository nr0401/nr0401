package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.User;
import com.newer.hospital.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2020年11月12日 10:47:00
 */

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


}
