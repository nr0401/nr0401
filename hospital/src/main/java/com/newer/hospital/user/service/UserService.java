package com.newer.hospital.user.service;

import com.newer.hospital.communal.entity.User;
import com.newer.hospital.user.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    /**
     * 获取全部用户信息
     *
     * @return
     */
    public List<User> allUser() {
        return userMapper.allUser();
    }

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    public User userById(Integer id) {
        return userMapper.userById(id);
    }
}
