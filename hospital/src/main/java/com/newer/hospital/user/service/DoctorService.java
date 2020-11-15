package com.newer.hospital.user.service;

import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.user.repository.DoctorMapper;
import com.sun.source.doctree.DocTree;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DoctorService.java
 * @Description TODO
 * @createTime 2020年11月13日 11:46:00
 */
@Service
public class DoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    /**
     * 获取获取医师的全部信息
     *
     * @return
     */
    public List<Doctor> allDoctor() {
        return doctorMapper.allDoctor();
    }

    /**
     * 根据id获取医师
     *
     * @param id
     * @return
     */
    public Doctor doctorById(Integer id) {
        return doctorMapper.deptById(id);
    }
}
