package com.newer.hospital.pharmacy.controller.service;

import java.util.List;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Prescription;

public interface DrugService {


    List<Drug> All();

    List<Drug> Singleandmultidrug(String title);

    List<Prescription> Whetherpay();

    int AddDrug(Drug drug);

    int UpdateDrug(int count, int id);

    int addCount(int id, int count);


}
