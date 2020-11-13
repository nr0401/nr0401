package com.newer.hospital.payment;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.hospital.communal.entity.Paymenthistory;
import com.newer.hospital.communal.entity.Prescription;
import com.newer.hospital.communal.util.mapper.PaymenthisoryMapper;
import com.newer.hospital.communal.util.mapper.PresciptionMapper;

@Service
public class PaymentService {

	@Autowired
	PresciptionMapper presciptionMapper;
	@Autowired
	PaymenthisoryMapper paymenthisoryMapper;

	public void a(Prescription presciption, BigDecimal total) {

		presciptionMapper.setStatus(presciption);
		Paymenthistory p = new Paymenthistory();
		p.setPerson(presciption.getPerson());
		p.setTotal(total);
		p.setTime(new Date(new java.util.Date().getTime()));
		paymenthisoryMapper.save(p);

	}

}
