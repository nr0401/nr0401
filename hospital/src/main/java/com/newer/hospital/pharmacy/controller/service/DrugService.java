package com.newer.hospital.pharmacy.controller.service;

import java.util.List;

import com.newer.hospital.communal.entity.Drug;
import com.newer.hospital.communal.entity.Prescription;

public interface DrugService {
	
	
	public List<Drug> All();
	
	public List<Drug> Singleandmultidrug(String title);
	
	public List<Prescription> Whetherpay();

	public int  AddDrug(Drug drug);
	
	public int UpdateDrug(int count,int id);
}
