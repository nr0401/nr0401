package com.newer.hospital.communal.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Registration {
    private int id;
    private Person person;
    private Date time;
    private BigDecimal total;
    private int status;
    private Doctor doctor;
    private int mark;
    private Dept dept;
    private Integer appointment;

    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getAppointment() {
        return appointment;
    }

    public void setAppointment(Integer appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", person=" + person +
                ", time=" + time +
                ", total=" + total +
                ", status=" + status +
                ", doctor=" + doctor +
                ", mark=" + mark +
                ", dept=" + dept +
                ", appointment=" + appointment +
                '}';
    }
}
