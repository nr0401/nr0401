package com.newer.hospital.personnel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.personnel.AdministrativeService;

/**
 * 行政模块
 *
 * @author 86199
 */
@CrossOrigin
@RestController
@RequestMapping("/doctor")
public class AdministrativeController {
    @Autowired
    AdministrativeService administrativeService;

    /**
     * 添加医师
     *
     * @param doctor
     * @return
     */
    @PostMapping("/administrative/add")
    public int AddDoctor(Doctor doctor) {
        return administrativeService.AddDoctor(doctor);
    }

    /**
     * 删除医师
     *
     * @param id
     * @return
     */
    @DeleteMapping("/administrative/{id}")
    public int DeleteDoctor(@PathVariable("id") int id) {

        return administrativeService.DeleteDoctor(id);
    }

    /**
     * 显示所有医师
     */
    @GetMapping("/administrative")
    public List<Doctor> AllDoctor() {
        return administrativeService.AllDoctor();
    }

    /**
     * 修改医师信息
     */
    @PutMapping("/administrative")
    public int UpdateDoctor(Doctor doctor) {
        return administrativeService.UpdateDoctor(doctor);
    }

    /**
     * 显示单个医师
     */
    @GetMapping("/administrative/{id}")
    public Doctor OneDoctor(@PathVariable("id") int id) {
        System.out.println(id);
        return administrativeService.OneDoctor(id);
    }
}
