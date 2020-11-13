package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DeptMapper.java
 * @Description TODO
 * @createTime 2020年11月12日 19:01:00
 */

@Mapper
@Repository
public interface DeptMapper {


    /**
     * 获取全部科室的信息
     *
     * @return
     */
    @Select("select * from dept")
    public List<Dept> allDept();


}
