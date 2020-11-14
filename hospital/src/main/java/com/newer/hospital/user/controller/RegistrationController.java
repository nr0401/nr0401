package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.Registration;
import com.newer.hospital.user.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName RegistrationController.java
 * @Description TODO
 * @createTime 2020年11月13日 11:26:00
 */

@RestController
@RequestMapping("/user")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;


    /**
     * 获取全部挂号单
     *
     * @return
     */
    @RequestMapping(value = "/registration/", method = RequestMethod.GET)
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
    @RequestMapping(value = "/registration/{registration}", method = RequestMethod.POST)
    public Integer addRegistration(@PathVariable Registration registration) {
        return registrationService.addRegistration(registration);
    }

    /**
     * 修改挂号人预约
     *
     * @param personId
     * @return
     */
    @RequestMapping(value = "/registration/appointment/{personId}", method = RequestMethod.PUT)
    public Integer updateAppointment(@PathVariable Integer personId) {
        return registrationService.updateAppointment(personId);
    }
}
