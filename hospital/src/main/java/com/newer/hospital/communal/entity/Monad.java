package com.newer.hospital.communal.entity;

public class Monad {
	int id;
	Drug drug;
	Prescription prescription;

	public Monad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Monad [id=" + id + ", drug=" + drug + ", prescription=" + prescription + "]";
	}

}
