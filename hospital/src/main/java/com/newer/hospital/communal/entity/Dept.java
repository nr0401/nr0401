package com.newer.hospital.communal.entity;

import java.util.List;

public class Dept {
	private int id;
	private String title;
	private String info;
	private Directory directory;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
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
		return "Dept{" +
				"id=" + id +
				", title='" + title + '\'' +
				", info='" + info + '\'' +
				", directory=" + directory +
				'}';
	}
}
