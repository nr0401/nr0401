package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Prescription;

@Mapper
public interface DrugMapper {

	/**
	 * 获取全部药品
	 * 
	 * @return
	 */
	@Select("select a.id,a.title," + "a.total,a.text,a.count,b.id b_id," + "b.title b_title,b.status b_status "
			+ "from drug a,drugtype b where a.drugtype_id=b.id")
	@Results({ @Result(property = "id", column = "id"), @Result(property = "title", column = "title"),
			@Result(property = "total", column = "total"), @Result(property = "text", column = "text"),
			@Result(property = "count", column = "count"), @Result(property = "drugtype.id", column = "b_id"),
			@Result(property = "drugtype.title", column = "b_title"),
			@Result(property = "drugtype.status", column = "b_status"), })
	public List<Drug> Drugall();

	/**
	 * 获取单个药品或者多个
	 * 
	 * @param title
	 * @return
	 */

	@Select("SELECT a.id,a.title,a.total,a.text,a.count,b.id b_id,b.title b_title,b.status b_status FROM drug a,drugtype b WHERE a.drugtype_id=b.id and a.title LIKE concat('%',#{title},'%') ")
	@Results({ @Result(property = "id", column = "id"), @Result(property = "title", column = "title"),
			@Result(property = "total", column = "total"), @Result(property = "text", column = "text"),
			@Result(property = "count", column = "count"), @Result(property = "drugtype.id", column = "b_id"),
			@Result(property = "drugtype.title", column = "b_title"),
			@Result(property = "drugtype.status", column = "b_status"), })
	public List<Drug> Singleandmultidrug(String title);

	/**
	 * 添加药品
	 */
	@Insert("INSERT INTO drug(title,total,`text`,`count`,drugtype_id) VALUES(#{title},#{total},#{text},#{count},#{drugtype_id})")
	public int AddDrug(Drug drug);
	/**
	 * 出货药品
	 */
	@Update("UPDATE drug SET drug.`count`=drug.`count`-#{count} WHERE drug.id=#{id}")
	public int UpdateDrug(int count,int id);
}
