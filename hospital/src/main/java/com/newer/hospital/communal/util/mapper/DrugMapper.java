package com.newer.hospital.communal.util.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Drugtype;

@Mapper
public interface DrugMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from drug where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "drugtype", javaType = Drugtype.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DrugtypeMapper.find")) })
	Drug find(int id);
}
