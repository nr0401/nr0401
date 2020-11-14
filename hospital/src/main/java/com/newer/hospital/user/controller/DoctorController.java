package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.user.service.DoctorService;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DoctorController.java
 * @Description TODO
 * @createTime 2020年11月13日 11:45:00
 */
@CrossOrigin
@RestController
@RequestMapping("/doctor")
public class DoctorController {


    @Autowired
    DoctorService doctorService;

    /**
     * 获取全部医师信息
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Doctor> getAllDoctor() {
        return doctorService.allDoctor();
    }

    /**
     * 根据id查询医师
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Doctor deptById(@PathVariable Integer id) {
        return doctorService.doctorById(id);
    }
}
