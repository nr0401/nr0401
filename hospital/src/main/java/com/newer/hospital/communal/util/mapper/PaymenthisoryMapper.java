package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.hospital.communal.entity.Paymenthistory;
import com.newer.hospital.communal.entity.Person;

@Mapper
public interface PaymenthisoryMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from paymenthistory where id = #{id}")
	@Results(id = "paymenthisory", value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "person", javaType = Person.class, one = @One(select = "findperson")) })
	Paymenthistory find(int id);

	/**
	 * 获取所有
	 * 
	 * @return
	 */
	@Select("select * from paymenthistory")
	@ResultMap("paymenthisory")
	List<Paymenthistory> findAll();

	/**
	 * 创建
	 * 
	 * @param paymenthistory
	 */
	@Insert("insert into paymenthistory(person_id,total) values(#{person.id},#{total})")
	void save(Paymenthistory paymenthistory);

	@Select("select id,name,gender,tel,identity from person where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id") })
	Person findperson(int id);

}
