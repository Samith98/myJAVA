package com;

public class Appartment {
	
	private int flatNo;
	private String flatOwner;
	private double waterBill;
	private double electricityBill;
	
	public Appartment(int flatNo, String flatOwner, double waterBill, double electricityBill) {
		super();
		this.flatNo = flatNo;
		this.flatOwner = flatOwner;
		this.waterBill = waterBill;
		this.electricityBill = electricityBill;
	}
	
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getFlatOwner() {
		return flatOwner;
	}
	public void setFlatOwner(String flatOwner) {
		this.flatOwner = flatOwner;
	}
	public double getWaterBill() {
		return waterBill;
	}
	public void setWaterBill(double waterBill) {
		this.waterBill = waterBill;
	}
	public double getElectricityBill() {
		return electricityBill;
	}
	public void setElectricityBill(double electricityBill) {
		this.electricityBill = electricityBill;
	}
	
}
