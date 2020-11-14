package com.newer.hospital.communal.entity;


/**
 * @author SongJinKang
 * @version 1.0.0
 * @ClassName Awaiting.java
 * @Description TODO
 * @createTime 2020年11月13日 16:24:00
 */
public class Awaiting {

    private Integer id;
    private Doctor doctor;
    private Registration registration;
    private Integer mark;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Awaiting(Integer id, Doctor doctor, Registration registration, Integer mark, Integer status) {
        this.id = id;
        this.doctor = doctor;
        this.registration = registration;
        this.mark = mark;
        this.status = status;
    }

    public Awaiting() {
    }

    @Override
    public String toString() {
        return "Awaiting{" +
                "id=" + id +
                ", doctor=" + doctor +
                ", registration=" + registration +
                ", mark=" + mark +
                ", status=" + status +
                '}';
    }
}
