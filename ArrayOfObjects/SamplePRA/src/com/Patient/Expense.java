package com;

public class Expense {
	
	private int expenseId;
	private double price;
	
	public Expense(int expenseId, double price) {
		super();
		this.expenseId = expenseId;
		this.price = price;
	}
	
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
