package com.newer.hospital.communal.entity;

import java.math.BigDecimal;

public class Doctor {
    private int id;
    private Dept dept;
    private String name;
    private String gender;
    private int status;
    private String work;
    private String birthday;
    private BigDecimal total;
    private String position;

    public Doctor() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", dept=" + dept +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", status=" + status +
                ", work='" + work + '\'' +
                ", birthday='" + birthday + '\'' +
                ", total=" + total +
                ", position='" + position + '\'' +
                '}';
    }
}
