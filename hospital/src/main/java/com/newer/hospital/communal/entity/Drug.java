package com.newer.hospital.communal.entity;

import java.math.BigDecimal;

public class Drug {
	private int id;
	private String title;
	private BigDecimal total;
	private String text;
	private int count;
	private Drugtype drugtype;

	public Drug() {
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Drugtype getDrugtype() {
		return drugtype;
	}

	public void setDrugtype(Drugtype drugtype) {
		this.drugtype = drugtype;
	}

	@Override
	public String toString() {
		return "Drug [id=" + id + ", title=" + title + ", total=" + total + ", text=" + text + ", count=" + count
				+ ", drugtype=" + drugtype + "]";
	}

}
