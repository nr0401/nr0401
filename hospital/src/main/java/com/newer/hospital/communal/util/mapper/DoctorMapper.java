package com.newer.hospital.communal.util.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;

@Mapper
public interface DoctorMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from doctor where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "dept", javaType = Dept.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DeptMapper.find")) })
	Doctor find(int id);
}
