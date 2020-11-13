package com.newer.hospital.user.service;

import com.newer.hospital.communal.entity.User;
import com.newer.hospital.user.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2020年11月12日 18:13:00
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    public Integer login(User user) {
        return userMapper.login(user);
    }







}
