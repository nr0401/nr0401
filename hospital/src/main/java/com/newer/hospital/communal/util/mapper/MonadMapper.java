package com.newer.hospital.communal.util.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Monad;
import com.newer.hospital.communal.entity.Prescription;

@Mapper
public interface MonadMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from monad where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "drug", javaType = Drug.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DrugMapper.find")),
			@Result(column = "id", property = "prescription", javaType = Prescription.class, one = @One(select = "com.newer.hospital.communal.util.mapper.PrescriptionMapper.find")) })
	Monad find(int id);
}
