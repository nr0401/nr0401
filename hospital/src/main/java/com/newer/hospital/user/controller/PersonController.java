package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.user.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName PersonController.java
 * @Description TODO
 * @createTime 2020年11月12日 20:35:00
 */

@RestController
@RequestMapping("/user/person")
public class PersonController {

    @Autowired
    PersonService personService;


    /**
     * 获取全部就诊人
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Person> allPerson() {
        return personService.allPerson();
    }

    /**
     * 根据id获取就诊人
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person personById(@PathVariable Integer id) {
        return personService.doctorById(id);
    }

    /**
     * 添加就诊人
     *
     * @param person
     * @return
     */
    @RequestMapping(value = "/{person}", method = RequestMethod.POST)
    public Integer addPerson(@PathVariable Person person) {
        return personService.addPerson(person);
    }

    /**
     * 修改就诊人信息
     *
     * @param person
     * @return
     */
    @RequestMapping(value = "/update/{person}", method = RequestMethod.PUT)
    public Integer updatePerson(@PathVariable Person person) {
        return personService.updatePerson(person);
    }

    /**
     * 删除就诊人
     *
     * @param id
     * @return
     */

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Integer deletePerson(@PathVariable Integer id) {
        return personService.deletePerson(id);
    }
}
