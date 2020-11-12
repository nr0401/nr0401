package com.newer.hospital.communal.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Paymenthistory {
	private int id;
	private Person person;
	private BigDecimal total;
	private Date time;

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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Paymenthistory [id=" + id + ", person=" + person + ", total=" + total + ", time=" + time + "]";
	}

}
