package com.newer.hospital.user.service;

import com.newer.hospital.communal.entity.Dept;
import com.newer.hospital.user.repository.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DeptService.java
 * @Description TODO
 * @createTime 2020年11月12日 19:27:00
 */

@Service
public class DeptService {

    @Autowired
    DeptMapper deptMapper;

    /**
     * 获取全部科室信息
     *
     * @return
     */
    public List<Dept> getAllDept() {
        return deptMapper.allDept();
    }
}
