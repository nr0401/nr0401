package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Dept;

@Mapper
public interface DeptMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from dept where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "doctorlist", javaType = List.class, many = @Many(select = "com.newer.hospital.communal.util.mapper.DoctorMapper.find")) })
	Dept find(int id);
}
