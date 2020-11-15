package com.newer.hospital.communal.entity;

import java.util.List;

public class Directory {
	private int id;
	private String title;
	private List<Dept> deptlist;

	public Directory() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Dept> getDeptlist() {
		return deptlist;
	}

	public void setDeptlist(List<Dept> deptlist) {
		this.deptlist = deptlist;
	}

	@Override
	public String toString() {
		return "Directory [id=" + id + ", title=" + title + ", deptlist=" + deptlist + "]";
	}

}
