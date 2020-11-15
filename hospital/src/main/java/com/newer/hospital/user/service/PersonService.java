package com.newer.hospital.user.service;

import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.user.repository.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName PersonService.java
 * @Description TODO
 * @createTime 2020年11月12日 20:33:00
 */

@Service
public class PersonService {

    @Autowired
    PersonMapper personMapper;

    /**
     * 获取全部就诊人
     *
     * @return
     */
    public List<Person> allPerson() {
        return personMapper.allPerson();
    }


    /**
     * 根据id获取就诊人
     *
     * @param id
     * @return
     */
    public Person doctorById(Integer id) {
        return personMapper.personById(id);
    }

    /**
     * 添加就诊人
     *
     * @param person
     * @return
     */
    public Integer addPerson(Person person) {
        return personMapper.addPerson(person);
    }

    /**
     * 删除一个就诊人
     *
     * @param id
     * @return
     */
    public Integer deletePerson(Integer id) {
        return personMapper.deletePerson(id);
    }

    /**
     * 修改一个就诊人
     *
     * @param person
     * @return
     */
    public Integer updatePerson(Person person) {
        return personMapper.updatePerson(person);
    }

}
