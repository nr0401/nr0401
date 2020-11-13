package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
    @Select("select * from doctor")
    List<Doctor> allDoctor();
}
