package com.newer.hospital.payment;

import java.math.BigDecimal;
import java.util.List;

import com.newer.hospital.communal.util.mapper.PresciptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.newer.hospital.communal.entity.Paymenthistory;
import com.newer.hospital.communal.entity.Prescription;
import com.newer.hospital.communal.util.mapper.PaymenthisoryMapper;

@CrossOrigin
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	@Autowired
	PaymentService paymentService;

	@Autowired
	PresciptionMapper presciptionMapper;
	@Autowired
	PaymenthisoryMapper paymenthisoryMapper;

	/**
	 * 提交缴费信息
	 * 
	 * @param prescription.id
	 * @return
	 */
	@PostMapping("/{id}")
	void a( @PathVariable int id) {
		paymentService.a(id);

	}

	/**
	 * 获取所有历史记录
	 * 
	 * @return
	 */
	@GetMapping("/paymenthistory")
	List<Paymenthistory> a() {
		return (List<Paymenthistory>) paymenthisoryMapper.findAll();
	}

	/**
	 * 获取单个历史记录
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/paymenthistory/{id}")
	Paymenthistory b(@PathVariable int id) {
		return paymenthisoryMapper.find(id);
	}

//	/**
//	 * 提交缴费信息
//	 * 
//	 * @param Prescription
//	 * @return
//	 */
//	@PostMapping("/presciption")
//	String c(@RequestBody Prescription presciption) {
//
////		paymentService.a(presciption);
////		return presciption;
//		System.out.println(presciption.toString());
//		return null;
//
//	}
	/**
	 * 获取所有就诊单
	 * 
	 * @return
	 */
	@GetMapping("/prescription")
	List<Prescription> d() {
		List<Prescription> list = presciptionMapper.findAll();
		for (Prescription l : list) {
			String s = l.getDrug();
			System.err.println(s);
		}
		return list;
	}

	/**
	 * 获取单个
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/prescription/{id}")
	Prescription e(@PathVariable int id) {
		return presciptionMapper.find(id);
	}

	/**
	 * 获取所有未付款
	 * 
	 * @return
	 */
	@GetMapping("/prescription/false")
	List<Prescription> f() {
		return presciptionMapper.findAllfalse();
	}

	/**
	 * 获取所有已付款
	 * 
	 * @return
	 */
	@GetMapping("/prescription/true")
	List<Prescription> g() {
		return presciptionMapper.findAlltrue();
	}

}
