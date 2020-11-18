package com.newer.hospital.dept;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Directory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DirectoryMapper.java
 * @Description TODO
 * @createTime 2020年11月15日 16:15:00
 */

@Mapper
public interface DirectoryMapper {
    /**
     * 根据id获取科室
     *
     * @return
     */
    @Select("select * from directory")
    List<Directory> allDirectory();

    /**
     * 根据科室获取部门
     *
     * @param id
     * @return
     */
    @Select("select * from dept where directory_id = #{id}")
    List<Dept> allByIdDirectory(Integer id);

    /**
     * 根据id查询科室
     *
     * @param id
     * @return
     */
    @Select("select * from directory where id = #{id}")
    Directory directoryById(Integer id);
}
