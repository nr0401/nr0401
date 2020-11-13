package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.user.service.DoctorService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DoctorController.java
 * @Description TODO
 * @createTime 2020年11月13日 11:45:00
 */

@RestController
public class DoctorController {


    @Autowired
    DoctorService doctorService;

    /**
     * 获取全部医师信息
     *
     * @return
     */
    @RequestMapping(value = "/doctor", method = RequestMethod.GET)
    public List<Doctor> getAllDoctor() {
        return doctorService.allDoctor();
    }

}
