package com.newer.hospital.communal.entity;

import java.util.List;

public class Dept {
	int id;
	String title;
	String info;
	List<Doctor> doctorlist;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Doctor> getDoctorlist() {
		return doctorlist;
	}

	public void setDoctorlist(List<Doctor> doctorlist) {
		this.doctorlist = doctorlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", title=" + title + ", info=" + info + ", doctorlist=" + doctorlist + "]";
	}

}
