package com.newer.hospital.pharmacy.controller.service.imp;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Prescription;
import com.newer.hospital.communal.util.mapper.DrugMapper;
import com.newer.hospital.communal.util.mapper.PresciptionMapper;
import com.newer.hospital.pharmacy.controller.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImp implements DrugService {
    /**
     * 显示所有药品
     */
    @Autowired
    DrugMapper drugmapper;


    @Autowired
    PresciptionMapper presciptionMapper;


    @Override
    public List<Drug> All() {
        return drugmapper.Drugall();
    }

    /**
     * 查询单个或多个药品
     */
    @Override
    public List<Drug> Singleandmultidrug(String title) {
        return drugmapper.Singleandmultidrug(title);
    }

    /**
     * 判断是否缴费
     */
    @Override
    public List<Prescription> Whetherpay() {
        return presciptionMapper.findAlltrue();
    }

    /**
     * 存入药品
     */
    @Override
    public int AddDrug(Drug drug) {
        return drugmapper.AddDrug(drug);
    }

    @Override
    public int UpdateDrug(int count, int id) {

        return drugmapper.UpdateDrug(count, id);
    }

    @Override
    public int addCount(int id, int count) {
        int count1 = drugmapper.addCount(id, count);

        return count1;
    }

}
