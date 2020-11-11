package com.newer.hospital.communal.entity;

import java.sql.Date;

public class Prescription {
	int id;
	Doctor doctor;
	Person person;
	String text;
	int status;
	Date time;
	Dept dept;
	String drug;

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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
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
		return "Prescription [id=" + id + ", doctor=" + doctor + ", person=" + person + ", text=" + text + ", status="
				+ status + ", time=" + time + ", dept=" + dept + ", drug=" + drug + "]";
	}

}
