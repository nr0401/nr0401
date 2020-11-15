package com.newer.hospital.communal.util.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.hospital.communal.entity.Doctor;

@Mapper
public interface DoctorMapper {
    /**
     * 获取单个
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM doctor a,dept b  WHERE a.`dept_id`=b.`id` and a.id = #{id}")
    @Results({@Result(property = "id", column = "id"),
            @Result(property = "dept.title", column = "title"),
            @Result(property = "dept.info", column = "info"),
            @Result(property = "name", column = "name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "total", column = "total"),
            @Result(property = "position", column = "position")
    })
    public Doctor OneDoctor(int id);


    @Select("SELECT * FROM doctor a,dept b  WHERE a.`dept_id`=b.`id`")
    @Results({@Result(property = "id", column = "id"),

            @Result(property = "dept.title", column = "title"),
            @Result(property = "dept.info", column = "info"),
            @Result(property = "name", column = "name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "total", column = "total"),
            @Result(property = "position", column = "position")


    })
    public List<Doctor> AllDoctor();

    /**
     * 修改医生信息
     */
    @Update("UPDATE doctor SET  dept_id=#{dept_id} ,`name`=#{name},gender=#{gender},total=#{total},`position`=#{position},friam=#{friam},fripm=#{fripm},momam=#{momam},mompm=#{mompm},satam=#{satam},satpm=#{satpm},sunam=#{sunam},sunpm=#{sunpm},thuam=#{thuam},thupm=#{thupm},tueam=#{tueam},tuepm=#{tuepm},wedam=#{wedam},wedpm=#{wedpm}\r\n" +
            "WHERE id=#{id}\r\n" +
            "")
    public int UpdateDoctor(Doctor doctor);

    /**
     * 添加医师信息(入职)
     */
    @Insert("INSERT INTO doctor(dept_id, NAME, gender, total, `position`, friam, fripm, momam, mompm, satam, satpm, sunam, sunpm,\r\n" +
            "                   thuam, thupm, tueam, tuepm, wedam, wedpm)\r\n" +
            "VALUES (#{dept_id}, #{NAME}, #{gender}, #{total},#{position},#{friam}, #{fripm}, #{momam},#{mompm}, #{satam}, #{satpm}, #{sunam},#{sunpm}, #{thuam},#{thupm},#{tueam},#{tuepm},#{wedam},#{wedpm})")
    public int AddDoctor(Doctor doctor);

    /**
     * 删除医师信息(离职)
     */
    @Delete("DELETE  FROM doctor  WHERE id=#{id}")
    public int DeleteDoctor(int id);
}
