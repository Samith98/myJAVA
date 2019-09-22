package com;

public class Customer {

	private int custId;
	private String custName;
	private String gender;
	private int age;
	
	/**
	 * @param custId
	 * @param custName
	 * @param gender
	 * @param age
	 */
	public Customer(int custId, String custName, String gender, int age) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.age = age;
	}
	
	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
