package com.newer.hospital.doctor.controller;

import java.util.List;

import com.newer.hospital.doctor.mapper.DoctorMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;
import com.newer.hospital.communal.entity.Doctor;
import com.newer.hospital.communal.entity.Prescription;
import com.newer.hospital.communal.entity.Registration;


@CrossOrigin
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorMappers doctorMapper;
	
	
	@GetMapping("/all")
	public List<Doctor> a(){
		return doctorMapper.doctorAll();
	}
	
	@GetMapping("/{id}")
	public Doctor b(@PathVariable int id) {
		return doctorMapper.doctors(id);
	}
	
	@GetMapping("/prescription/{id}")
	public List<Prescription> c(@PathVariable int id) {
		return (List<Prescription>)doctorMapper.prescriptionAll(id);
	}
	
	@PutMapping("/re/{id}")
	public void updateaw(@PathVariable int id,@RequestBody JSONObject status) {
		Integer asd = (Integer)status.get("key");
		doctorMapper.updateaw(asd,id);
	}
	
	
	@PostMapping("/re/{id}")
	public List<Registration> d(@PathVariable int id,@RequestBody JSONObject daytime){	
		String daytimes=(String)daytime.get("daytime");
		return (List<Registration>)doctorMapper.registrationAll(daytimes, id);
	}
	
	@GetMapping("/re/{id}")
	public JSONObject e(@PathVariable int id
			,@RequestBody JSONObject texts
			){	
		String daytime=(String)texts.get("daytime");
		Integer statuss = (Integer) texts.get("statuss");
		return doctorMapper.registrations(id, daytime, statuss);
				
	} 
	
	@PostMapping("/re/create")
	public void f(@RequestBody Prescription prescription) {
		System.out.println(prescription.getDrug());
		doctorMapper.caretcBinli(prescription);
	}
	
	
//	"{\"id\": 2, \"text\": \"1治疗感冒\", \"title\": \"1感康\", \"total\": 63.0, \"drugtype_id\": 1}"
	

	

	
	
	
	
}
