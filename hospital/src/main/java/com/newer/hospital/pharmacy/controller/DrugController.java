package com.newer.hospital.pharmacy.controller;

import java.util.List;

import com.newer.hospital.pharmacy.controller.service.imp.DrugServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Prescription;

@Controller
@CrossOrigin
@RestController
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
@RequestMapping("drug")
public class DrugController {

    @Autowired
    DrugServiceImp drugimp;

    /**
     * 获取全部药品和药品对应的类型
     *
     * @return
     */
    @GetMapping("/pharmacy")
    public List<Drug> alldrug() {

        return drugimp.All();

    }

    /**
     * 查询单个或多个药品 模糊查询
     *
     * @param title
     * @return
     */
    @GetMapping("/pharmacy/{title}")
    public List<Drug> singledrug(@PathVariable("title") String title) {

        System.out.println(title + "---------------");

        return drugimp.Singleandmultidrug(title);
    }

    /**
     * 已缴费就诊单
     *
     * @return
     */
    @GetMapping("/prescription")
    public List<Prescription> whetherpay() {
        return drugimp.Whetherpay();
    }

    /**
     * 存入药品
     *
     * @param drug
     * @return
     */
    @PostMapping("/pharmacy/add")
    public int Addgrug(@RequestBody Drug drug) {

        return drugimp.AddDrug(drug);
    }

    /**
     * 出货药品
     *
     * @param count
     * @param id
     * @return
     */
    @PutMapping("/pharmacy/DALETE/{count}/{id}")
    public int UpdateDrug(@PathVariable("count") int count, @PathVariable("id") int id) {


        return drugimp.UpdateDrug(count, id);
    }
}
