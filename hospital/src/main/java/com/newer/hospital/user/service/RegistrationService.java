package com.newer.hospital.user.service;

import com.newer.hospital.communal.entity.Registration;
import com.newer.hospital.user.repository.RegistrationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName RegistrationService.java
 * @Description TODO
 * @createTime 2020年11月13日 08:47:00
 */

@Service
public class RegistrationService {


    @Autowired
    RegistrationMapper registrationMapper;


    /**
     * 添加挂号单
     *
     * @param registration
     * @return
     */
    public Integer addRegistration(Registration registration) {
        return registrationMapper.addRegistration(registration);
    }


    /**
     * 获取全部挂号单
     *
     * @return
     */
    public List<Registration> allRegistration() {
        return registrationMapper.allRegistration();
    }


    /**
     * 修改挂号状态
     *
     * @param id
     * @return
     */
    public Integer updateStatus(Integer id) {
        return registrationMapper.updateStatus(id);
    }


    /**
     * 修改挂号人是否预约（1.预约，0，取消预约）
     *
     * @param personId
     * @return
     */
    public Integer updateAppointment(Integer personId) {
        return registrationMapper.updateAppointment(personId);
    }
}
