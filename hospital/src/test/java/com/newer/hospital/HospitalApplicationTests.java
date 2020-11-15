package com.newer.hospital;

import com.newer.hospital.communal.entity.*;
import com.newer.hospital.dept.DirectoryMapper;
import com.newer.hospital.user.repository.DeptMapper;
import com.newer.hospital.user.repository.PersonMapper;
import com.newer.hospital.user.repository.RegistrationMapper;
import com.newer.hospital.user.repository.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

    @Autowired
    DirectoryMapper directoryMapper;

    @Test
    public void i() {
        List<Directory> directories = directoryMapper.allDirectory();
        System.out.println(directories);
    }

    @Test
    void t() {

    }

    @Test
    void contextLoads() {
        ;
        Registration registration = new Registration();
        Doctor doctor = new Doctor();
        doctor.setId(1);
        registration.setDoctor(doctor);
        Person person = new Person();
        person.setId(1);
        registration.setPerson(person);
        Dept dept = new Dept();
        dept.setId(2);
        registration.setDept(dept);
        registration.setTime(new Date());
        registration.setTotal(BigDecimal.valueOf(55));
        registration.setVisitTime(new Date().toLocaleString());
        registration.setDayTime("am");
        registrationMapper.addRegistration(registration);
    }

    @Test
    void test() {
        Integer integer = registrationMapper.updateAppointment(1);
        System.out.println(integer);
    }


}
