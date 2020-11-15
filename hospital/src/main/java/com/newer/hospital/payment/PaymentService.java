package com.newer.hospital.payment;

import java.math.BigDecimal;
import java.sql.Date;

import com.newer.hospital.communal.entity.Person;
import com.newer.hospital.communal.util.mapper.PresciptionMapper;
import com.newer.hospital.user.repository.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.hospital.communal.entity.Paymenthistory;
import com.newer.hospital.communal.entity.Prescription;
import com.newer.hospital.communal.util.mapper.PaymenthisoryMapper;

@Service
public class PaymentService {

    @Autowired
    PresciptionMapper presciptionMapper;
    @Autowired
    PaymenthisoryMapper paymenthisoryMapper;
    @Autowired
    PersonMapper personMapper;

    public void a(Prescription presciption, BigDecimal total) {

        presciptionMapper.setStatus(presciption);
        Paymenthistory p = new Paymenthistory();
        Person person = personMapper.personById(presciption.getPerson_id());
        p.setPerson(person);
        p.setTotal(total);
        p.setTime(new Date(new java.util.Date().getTime()));
        paymenthisoryMapper.save(p);

    }

}
