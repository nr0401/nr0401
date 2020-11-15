package com.newer.hospital.communal.entity;

import java.math.BigDecimal;

public class Prescription {
    private int id;
    private int doctor_id;
    private int person_id;
    private String text;
    private int status;
    private String time;
    private int dept_id;
    private String drug;
    private BigDecimal total;
    private Person person;
    private Doctor doctor;
    private Dept dept;


    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Prescription() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", doctor_id=" + doctor_id +
                ", person_id=" + person_id +
                ", text='" + text + '\'' +
                ", status=" + status +
                ", time='" + time + '\'' +
                ", dept_id=" + dept_id +
                ", drug='" + drug + '\'' +
                ", total=" + total +
                ", person=" + person +
                ", doctor=" + doctor +
                ", dept=" + dept +
                '}';
    }
}
