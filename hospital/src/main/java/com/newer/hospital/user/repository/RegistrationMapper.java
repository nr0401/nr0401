package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName RegistrationMapper.java
 * @Description TODO
 * @createTime 2020年11月13日 08:45:00
 */

@Mapper
@Repository
public interface RegistrationMapper {

    /**
     * 添加挂号单
     *
     * @param registration
     * @return
     */
    @Insert("insert into registration(person_id,time,total,status,doctor_id,mark,dept_id,visit_time,day_time) values(#{person.id},#{time},#{total},#{status},#{doctor.id},#{mark},#{dept.id},#{visitTime},#{dayTime})")
    Integer addRegistration(Registration registration);


    /**
     * 获取全部挂号单
     *
     * @return
     */
    @Results(id = "registrationMap", value = {
            @Result(column = "person_id", property = "person", javaType = Person.class, one = @One(select = "com.newer.hospital.user.repository.PersonMapper.personById")),
            @Result(column = "doctor_id", property = "doctor", javaType = Doctor.class, one = @One(select = "OneDoctor")),
            @Result(column = "dept_id", property = "dept", javaType = Dept.class, one = @One(select = "deptById"))
    })
    @Select("select * from registration")
    List<Registration> allRegistration();

    /**
     * 根据id获取医生
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM doctor a,dept b  WHERE a.`dept_id`=b.`id` and a.id = #{id}")
    @Results({@Result(property = "id", column = "id"),
            @Result(property = "dept.title", column = "title"),
            @Result(property = "dept.info", column = "info"),
            @Result(property = "name", column = "name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "total", column = "total"),
            @Result(property = "position", column = "position")
    })
    public Doctor OneDoctor(int id);

    /**
     * 根据id获取部门
     *
     * @param id
     * @return
     */
    @Select("select * from dept where id = #{id}")
    Dept deptById(Integer id);

    /**
     * 根据id获取就诊人
     *
     * @param id
     * @return
     */
    @Select("select * from person where id =#{id}")
    Person personById(Integer id);


    /**
     * 修改挂号人状态(签到)
     *
     * @param personId
     * @return
     */
    @Update("update registration set status = 1 where person_id = #{personId}")
    Integer updateStatus(Integer personId);


    /**
     * 修改用户是否预约
     *
     * @param personId
     * @return
     */
    @Update("update registration set appointment = 0 where person_id = #{personId}")
    Integer updateAppointment(Integer personId);


}
