package com.newer.hospital.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.communal.entity.Prescription;
import com.newer.hospital.communal.entity.Registration;
import com.newer.hospital.user.repository.RegistrationMapper;
import com.newer.hospital.user.service.RegistrationService;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName RegistrationController.java
 * @Description TODO
 * @createTime 2020年11月13日 11:26:00
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @Autowired
    RegistrationMapper registrationMapper;


    /**
     * 获取全部挂号单
     *
     * @return
     */
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public List<Registration> allRegistration() {
        return registrationService.allRegistration();
    }

    /**
     * 修改挂号单状态
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/registration/{id}", method = RequestMethod.PUT)
    public Integer updateStatus(@PathVariable Integer id) {
        return registrationService.updateStatus(id);
    }

    /**
     * 添加挂号单
     *
     * @param registration
     * @return
     */
    @RequestMapping(value = "/registration/add", method = RequestMethod.POST)
    public Integer addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    /**
     * 跟新挂号信息
     *
     * @param registration
     * @param
     * @return
     */
    @RequestMapping(value = "/registration/update", method = RequestMethod.PUT)
    public Integer updateRegistration(@RequestBody Registration registration) {
        return registrationMapper.updateRegistration(registration);
    }

    /**
     * 删除挂号信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/registration/delete/{id}", method = RequestMethod.DELETE)
    public Integer deleteRegistration(@PathVariable Integer id) {
        return registrationMapper.deleteRegistration(id);
    }

    /**
     * 修改挂号人预约
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/registration/appointment/{id}", method = RequestMethod.PUT)
    public Integer updateAppointment(@PathVariable Integer id) {
        return registrationService.updateAppointment(id);
    }


    /**
     * 根据id挂号单分页
     *
     * @param limits
     * @return
     */
    @PostMapping(value = "/limit/{id}")
    public List<Registration> bbq(@RequestBody JSONObject limits, @PathVariable Integer id) {
        Integer offset = (Integer) limits.get("offset");
        Integer limit = (Integer) limits.get("limit");
        limit = (limit - 1) * offset;
        return registrationMapper.registrationlimit(offset, limit, id);
    }

    /**
     * 全部信息分页挂号单分页
     *
     * @param limits
     * @return
     */
    @GetMapping(value = "/limit/all")
    public List<Registration> allPage(@RequestBody JSONObject limits) {
        Integer offset = (Integer) limits.get("offset");
        Integer limit = (Integer) limits.get("limit");
        limit = (limit - 1) * offset;
        return registrationMapper.registrationAlllimit(offset, limit);
    }


    /**
     * 就诊记录分页
     *
     * @param limits
     * @return
     */
    @PostMapping(value = "/prescription/limit/{id}")
    public List<Prescription> a(@RequestBody JSONObject limits, @PathVariable Integer id) {
        Integer offset = (Integer) limits.get("offset");
        Integer limit = (Integer) limits.get("limit");
        limit = (limit - 1) * offset;
        return registrationMapper.prescriptionlimit(offset, limit, id);
    }
}
