package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName PersonMapper.java
 * @Description TODO
 * @createTime 2020年11月12日 19:56:00
 */

@Mapper
@Repository
public interface PersonMapper {


    /**
     * 添加就诊人
     *
     * @param person
     * @return
     */
    @Insert("insert into person(user_id,identity,tel,gender,birthday) values(#{user.id},#{identity},#{tel},#{gender},#{birthday})")
    Integer addPerson(Person person);


    /**
     * 获取全部就诊人
     *
     * @return
     */
    @Select("select * from person")
    List<Person> allPerson();

    /**
     * 根据id获取就诊人
     *
     * @param id
     * @return
     */
    @Select("select * from person where id =#{id}")
    Person personById(Integer id);


    /**
     * 修改就诊人信息
     *
     * @param person
     * @return
     */
    @Update("update person set user_id=#{user.id},identity=#{identity},tel=#{tel},gender=#{gender},birthday=#{birthday} where id = #{id}")
    Integer updatePerson(Person person);


    /**
     * 删除一个就诊人
     *
     * @param id
     * @return
     */
    @Delete("delete from person where id = #{id}")
    Integer deletePerson(Integer id);


}
