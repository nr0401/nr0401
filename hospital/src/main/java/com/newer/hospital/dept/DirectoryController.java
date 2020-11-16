package com.newer.hospital.dept;

import com.newer.hospital.communal.entity.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName DirectoryController.java
 * @Description TODO
 * @createTime 2020年11月16日 16:05:00
 */
@CrossOrigin
@RestController
public class DirectoryController {

    @Autowired
    DirectoryMapper directoryMapper;

    /**
     * 查询全部科室
     *
     * @return
     */
    @RequestMapping(value = "/directory", method = RequestMethod.GET)
    public List<Directory> allDirectory() {
        return directoryMapper.allDirectory();
    }

    /**
     * id查询科室
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/directory/{id}", method = RequestMethod.GET)
    public Directory directoryById(@PathVariable Integer id) {
        return directoryMapper.directoryById(id);
    }
}
