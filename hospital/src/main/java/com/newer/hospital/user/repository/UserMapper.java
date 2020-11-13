package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName UserMapper.java
 * @Description TODO
 * @createTime 2020年11月12日 18:14:00
 */

@Mapper
@Repository
public interface UserMapper {

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Insert("insert into user(name,age,gender,tel,identity) values(#{name},#{age},#{gender},#{tel},#{identity})")
     Integer login(User user);




}
