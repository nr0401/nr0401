package com.newer.hospital.personnel;

import java.lang.annotation.Documented;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.communal.util.mapper.DoctorMapper;

@Service
public class AdministrativeService {
    @Autowired
    DoctorMapper doctormapper;

    /**
     * 显示所有医师
     *
     * @return
     */
    public List<Doctor> AllDoctor() {

        return doctormapper.AllDoctor();
    }

    ;

    /**
     * 显示单个医师
     */

    public Doctor OneDoctor(int id) {

        return doctormapper.OneDoctor(id);
    }

    ;


    /**
     * 修改医师信息
     *
     * @param doctor
     * @return
     */
    public int UpdateDoctor(Doctor doctor) {

        return doctormapper.UpdateDoctor(doctor);

    }

    ;

    /**
     * 添加医师
     */
    public int AddDoctor(Doctor doctor) {
        return doctormapper.AddDoctor(doctor);
    }

    /**
     * 删除医师
     */
    public int DeleteDoctor(int id) {
        return doctormapper.DeleteDoctor(id);
    }
}
