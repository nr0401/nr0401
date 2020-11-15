package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.Registration;
import com.newer.hospital.communal.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
    @Select("select * from registration")
    List<Registration> allRegistration();

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
