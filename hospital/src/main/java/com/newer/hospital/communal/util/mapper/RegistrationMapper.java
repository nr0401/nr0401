package com.newer.hospital.communal.util.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.communal.entity.Registration;

@Mapper
public interface RegistrationMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from registration where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "person", javaType = Person.class, one = @One(select = "com.newer.hospital.communal.util.mapper.PersonMapper.find")),
			@Result(column = "id", property = "doctoc", javaType = Doctor.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DoctocMapper.find")),
			@Result(column = "id", property = "dept", javaType = Dept.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DeptMapper.find")) })
	Registration find(int id);
}
