package com.newer.hospital.user.repository;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Directory;
import com.newer.hospital.communal.entity.Doctor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
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
    @Results(id = "directoryMap", value = {
            @Result(column = "directory_id", property = "directory", javaType = Directory.class, one = @One(select = "com.newer.hospital.dept.DirectoryMapper.directoryById"))
    })
    @Select("select * from dept")
    List<Dept> allDept();

    /**
     * 根据id查询科室
     *
     * @param id
     * @return
     */
    @ResultMap("directoryMap")
    @Select("select * from dept where id = #{id}")
    Dept deptById(Integer id);


}
