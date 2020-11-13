package com.newer.hospital;

import com.newer.hospital.user.repository.DeptMapper;
import com.newer.hospital.user.repository.PersonMapper;
import com.newer.hospital.user.repository.RegistrationMapper;
import com.newer.hospital.user.repository.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HospitalApplicationTests {


    @Autowired
    DeptMapper deptMapper;

    @Autowired
    UserMapper userMapper;


    @Autowired
    PersonMapper personMapper;

    @Autowired
    RegistrationMapper registrationMapper;

    @Test
    void contextLoads() {
        Integer integer = registrationMapper.updateStatus(1);
        System.out.println(integer);
    }


}
