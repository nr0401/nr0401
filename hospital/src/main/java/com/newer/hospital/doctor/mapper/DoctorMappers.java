package com.newer.hospital.doctor.mapper;

import java.util.List;

import com.newer.hospital.communal.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.alibaba.fastjson.JSONObject;



@Mapper
public interface DoctorMappers {

    @Results(id = "deptmap",
            value = {
                    @Result(column = "title", property = "title")
            })
    @Select("select * from dept where id = #{id}")
    Dept deptId(int id);


    /**
     * 查询单个患者信息
     *
     * @param id
     * @return
     */

    @Select("select * from person where id = #{id}")
    Person personById(int id);

    /**
     * 分页查询医师
     *
     * @param offset
     * @param limit
     * @return
     */
    @Select("select * from doctor limit #{offset} offset #{limit}")
    @ResultMap("doctormap")
    List<Doctor> doctorlimit(int offset, int limit);

    /**
     * 查询全部医生的信息及部门
     *
     * @return
     */
    @Select("select * from doctor")
    @Results(id = "doctormap",
            value = {
                    @Result(column = "dept_id", property = "dept", javaType = Dept.class, one = @One(select = "deptId"))
            })
    List<Doctor> doctorAll();

    /**
     * 查询病人的全部病例
     */
    @Results(
            value = {
                    @Result(column = "person_id", property = "person", javaType = Person.class, one = @One(select = "personById")),
                    @Result(column = "doctor_id", property = "doctor", javaType = Doctor.class, one = @One(select = "doctors")),
                    @Result(column = "dept_id", property = "dept", javaType = Dept.class, one = @One(select = "deptId"))
            }
    )
    @Select("select * from prescription where person_id = #{id}")
    List<Prescription> prescriptionAll(int id);


    /**
     * 查询单个医生的信息
     *
     * @param id
     * @return
     */
    @ResultMap("doctormap")
    @Select("select* from doctor where id = #{id}")
    Doctor doctors(int id);


    /**
     * 跟子部门查询全部医生
     *
     * @param id
     * @return
     */
    @ResultMap("doctormap")
    @Select("select * from doctor where dept_id = #{id}")
    List<Doctor> doctorss(int id);


    /**
     * 查询某一医生今天所有以挂号患者
     * 参数 时间 ，医生ID
     */
    @Results(
            value = {
                    @Result(column = "visit_time", property = "visitTime"),
                    @Result(column = "day_time", property = "dayTime"),
                    @Result(column = "person_id", property = "person", javaType = Person.class, one = @One(select = "personById"))
            }
    )
    @Select("select re.* from registration re left join person pe on re.person_id=pe.id where re.visit_time = #{daytime} and re.doctor_id = #{id}")
    List<Registration> registrationAll(String daytime, int id);

    /**
     * 查询以签到候诊并且状态为 0：等待，1：叫号，2：过号，3：就诊完 的患者的信息
     * 参数：医生ID，就诊当日时间
     *
     * @return
     */
    @Select("select * from person pe right join  (select aw.mark,re.person_id,re.visit_time,aw.id awmid,aw.status,re.day_time from awaiting aw left join registration re on aw.registration_id = re.id where aw.status=#{status} and aw.doctor_id = #{id} and re.visit_time = #{daytime}) awm on awm.person_id = pe.id")
    JSONObject registrations(int id, String daytime, int status);

    /**
     * 修改候诊人的状态
     */
    @Update("update awaiting set `status` = #{status} where id = #{id}")
    void updateaw(int status, int id);

    /**
     * 传病人Id 医生Id 和 病例内容
     */
    @Insert("insert into prescription (doctor_id,person_id,`text`,`status`,dept_id,`drug`,`total`) values(#{doctor_id},#{person_id},#{text},#{status},#{dept_id},#{drug},#{total})")
    void caretcBinli(Prescription prescription);


}
