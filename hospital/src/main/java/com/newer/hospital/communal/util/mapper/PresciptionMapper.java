package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
<<<<<<< HEAD
import org.apache.ibatis.annotations.ResultMap;
=======
>>>>>>> song
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
<<<<<<< HEAD
	@Results(id = "prescription", value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "person", javaType = Person.class, one = @One(select = "findperson")),
			@Result(column = "id", property = "doctor", javaType = Doctor.class, one = @One(select = "finddoctor")),
			@Result(column = "id", property = "dept", javaType = Dept.class, one = @One(select = "finddept")),
			@Result(column = "drug", property = "drug") })
=======
	@Results(value = { @Result(column = "id", property = "id"),
			@Result(column = "id", property = "person", javaType = Person.class, one = @One(select = "com.newer.hospital.communal.util.mapper.PersonMapper.find")),
			@Result(column = "id", property = "doctoc", javaType = Doctor.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DoctocMapper.find")),
			@Result(column = "id", property = "dept", javaType = Dept.class, one = @One(select = "com.newer.hospital.communal.util.mapper.DeptMapper.find")) })
>>>>>>> song
	Prescription find(int id);

	/**
	 * 返回所有就诊单
	 * 
	 * @return
	 */
	@Select("select * from prescription")
<<<<<<< HEAD
	@ResultMap("prescription")
=======
>>>>>>> song
	List<Prescription> findAll();

	/**
	 * 返回所有未付款就诊单
	 * 
	 * @return
	 */
	@Select("select * from prescription where status = 0")
<<<<<<< HEAD
	@ResultMap("prescription")
=======
>>>>>>> song
	List<Prescription> findAllfalse();

	/**
	 * 返回所有已付款就诊单
	 * 
	 * @return
	 */
	@Select("select * from prescription where status = 1")
<<<<<<< HEAD
	@ResultMap("prescription")
=======
>>>>>>> song
	List<Prescription> findAlltrue();

	/**
	 * 修改就诊单付款状态
	 * 
	 * @param prescription
	 */
	@Update("update prescription set status=1 where id = #{id}")
	void setStatus(Prescription prescription);
<<<<<<< HEAD

	@Select("select * from doctor where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"), })
	Doctor finddoctor(int id);

	@Select("select * from person where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"), })
	Person findperson(int id);

	@Select("select * from dept where id = #{id}")
	@Results(value = { @Result(column = "id", property = "id"), })
	Dept finddept(int id);
=======
>>>>>>> song
}
