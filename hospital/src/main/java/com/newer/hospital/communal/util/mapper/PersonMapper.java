package com.newer.hospital.communal.util.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.communal.entity.User;

@Mapper
public interface PersonMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from person where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "user", javaType = User.class, one = @One(select = "com.newer.hospital.communal.util.mapper.UserMapper.find")) })
	Person find(int id);
}
