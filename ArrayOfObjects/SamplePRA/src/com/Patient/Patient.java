package com;

public class Patient {
	
	private int patientId;
	private String patientName;
	private int totalNoOfDays;
	private char ward;
	private double taxPercentage;
	
	public Patient(int patientId, String patientName, int totalNoOfDays, char ward, double taxPercentage) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.totalNoOfDays = totalNoOfDays;
		this.ward = ward;
		this.taxPercentage = taxPercentage;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getTotalNoOfDays() {
		return totalNoOfDays;
	}

	public void setTotalNoOfDays(int totalNoOfDays) {
		this.totalNoOfDays = totalNoOfDays;
	}

	public char getWard() {
		return ward;
	}

	public void setWard(char ward) {
		this.ward = ward;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
}
