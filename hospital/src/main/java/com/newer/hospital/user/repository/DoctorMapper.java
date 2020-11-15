package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DoctorMapper.java
 * @Description TODO
 * @createTime 2020年11月13日 11:45:00
 */
@Repository
@Mapper
public interface DoctorMapper {

    /**
     * 获取获取医师的全部信息
     *
     * @return
     */
    @Results(id = "doctorMap", value = {
            @Result(column = "dept_id",
                    property = "dept",
                    javaType = Dept.class,
                    one = @One(select = "com.newer.hospital.user.repository.DeptMapper.deptById")
            )
    })
    @Select("select * from doctor")
    List<Doctor> allDoctor();


    /**
     * 根据id查询医师
     *
     * @param id
     * @return
     */
    @ResultMap("doctorMap")
    @Select("select * from doctor where id = #{id}")
    Doctor deptById(Integer id);
}
