package com.newer.hospital.communal.entity;

import java.math.BigDecimal;

public class Doctor {
    private int id;
    private Dept dept;
    private String name;
    private String grnder;
    private int status;
    private String work;
    private String birthday;
    private BigDecimal total;
    private String position;
    private int friam;
    private int fripm;
    private int mompm;
    private int monam;
    private int satam;
    private int satpm;
    private int sunam;
    private int sunpm;
    private int thuam;
    private int thupm;
    private int tueam;
    private int tuepm;
    private int wedam;
    private int wedpm;

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

    public String getGrnder() {
        return grnder;
    }

    public void setGrnder(String grnder) {
        this.grnder = grnder;
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

    public int getFriam() {
        return friam;
    }

    public void setFriam(int friam) {
        this.friam = friam;
    }

    public int getFripm() {
        return fripm;
    }

    public void setFripm(int fripm) {
        this.fripm = fripm;
    }

    public int getMompm() {
        return mompm;
    }

    public void setMompm(int mompm) {
        this.mompm = mompm;
    }

    public int getMonam() {
        return monam;
    }

    public void setMonam(int monam) {
        this.monam = monam;
    }

    public int getSatam() {
        return satam;
    }

    public void setSatam(int satam) {
        this.satam = satam;
    }

    public int getSatpm() {
        return satpm;
    }

    public void setSatpm(int satpm) {
        this.satpm = satpm;
    }

    public int getSunam() {
        return sunam;
    }

    public void setSunam(int sunam) {
        this.sunam = sunam;
    }

    public int getSunpm() {
        return sunpm;
    }

    public void setSunpm(int sunpm) {
        this.sunpm = sunpm;
    }

    public int getThuam() {
        return thuam;
    }

    public void setThuam(int thuam) {
        this.thuam = thuam;
    }

    public int getThupm() {
        return thupm;
    }

    public void setThupm(int thupm) {
        this.thupm = thupm;
    }

    public int getTueam() {
        return tueam;
    }

    public void setTueam(int tueam) {
        this.tueam = tueam;
    }

    public int getTuepm() {
        return tuepm;
    }

    public void setTuepm(int tuepm) {
        this.tuepm = tuepm;
    }

    public int getWedam() {
        return wedam;
    }

    public void setWedam(int wedam) {
        this.wedam = wedam;
    }

    public int getWedpm() {
        return wedpm;
    }

    public void setWedpm(int wedpm) {
        this.wedpm = wedpm;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", dept=" + dept +
                ", name='" + name + '\'' +
                ", grnder='" + grnder + '\'' +
                ", status=" + status +
                ", work='" + work + '\'' +
                ", birthday='" + birthday + '\'' +
                ", total=" + total +
                ", position='" + position + '\'' +
                ", friam=" + friam +
                ", fripm=" + fripm +
                ", mompm=" + mompm +
                ", monam=" + monam +
                ", satam=" + satam +
                ", satpm=" + satpm +
                ", sunam=" + sunam +
                ", sunpm=" + sunpm +
                ", thuam=" + thuam +
                ", thupm=" + thupm +
                ", tueam=" + tueam +
                ", tuepm=" + tuepm +
                ", wedam=" + wedam +
                ", wedpm=" + wedpm +
                '}';
    }
}
