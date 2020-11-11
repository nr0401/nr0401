package com.newer.hospital.communal.entity;

import java.math.BigDecimal;

public class Paymenthistory {
	private int id;
	private Person person;
	private BigDecimal total;
	private java.sql.Date time;

	public Paymenthistory() {
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public java.sql.Date getTime() {
		return time;
	}

	public void setTime(java.sql.Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Paymenthistory [id=" + id + ", person=" + person + ", total=" + total + ", time=" + time + "]";
	}

}
