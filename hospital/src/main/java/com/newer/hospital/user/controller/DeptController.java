package com.newer.hospital.user.controller;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.user.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DeptController.java
 * @Description TODO
 * @createTime 2020年11月12日 19:26:00
 */

@CrossOrigin
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;


    /**
     * 获取全部科室信息
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Dept> getAllDept() {
        return deptService.getAllDept();
    }

    /**
     * 根据id查询科室
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Dept deptById(@PathVariable Integer id) {
        return deptService.deptById(id);
    }


}
