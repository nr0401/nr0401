package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Drugtype;

@Mapper
public interface DrudtypeMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from drugtype where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "druglist", javaType = List.class, many = @Many(select = "com.newer.hospital.communal.util.mapper.DrugMapper.find")) })
	Drugtype find(int id);
}
