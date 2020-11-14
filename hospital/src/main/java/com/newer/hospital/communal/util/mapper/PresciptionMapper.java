package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.communal.entity.Prescription;

@Mapper
public interface PresciptionMapper {
	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from prescription where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "person", javaType = Person.class, one = @One(select = "com.newer.hospital.communal.util.mapper.PersonMapper.find")),
			@Result(column = "id", property = "doctoc", javaType = Doctor.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DoctocMapper.find")),
			@Result(column = "id", property = "dept", javaType = Dept.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DeptMapper.find")) })
	Prescription find(int id);

	/**
	 * 返回所有就诊单
	 * 
	 * @return
	 */
	@Select("select * from prescription")
	List<Prescription> findAll();

	/**
	 * 返回所有未付款就诊单
	 * 
	 * @return
	 */
	@Select("select * from prescription where status = 0")
	List<Prescription> findAllfalse();

	/**
	 * 返回所有已付款就诊单
	 * 
	 * @return
	 */
	@Select("select * from prescription where status = 1")
	List<Prescription> findAlltrue();

	/**
	 * 修改就诊单付款状态
	 * 
	 * @param prescription
	 */
	@Update("update prescription set status=1 where id = #{id}")
	void setStatus(Prescription prescription);
}
