package com;

public class AppartmentDemo {

	public static void main(String[] args) {
		
		Appartment a1 = new Appartment(101, "Ram", 400, 660);
		Appartment a2 = new Appartment(102, "Krish", 420, 650);
		Appartment a3 = new Appartment(103, "Vijay", 430, 630);
		Appartment a4 = new Appartment(104, "Murthy", 480, 690);
		Appartment a5 = new Appartment(105, "Jhon", 460, 680);
		
		Appartment[] apts = { a1, a2, a3, a4, a5 };
		
		System .out.println("Flat Owner of Min Electricity Bill : " + AppartmentDemo.getFlatOwnerOfMinElectricityBill(apts));
		
		System .out.println("Second Min water Bill : "+	AppartmentDemo.getSecondMinWaterBill(apts));
		
	}
	
	public static String getFlatOwnerOfMinElectricityBill(Appartment[] apt) {
		
		if(apt == null) {
			return null;
		}
		
		int i = 0;
		int len = apt.length;
		double min = Double.MAX_VALUE;
		int index = 0;
		for(i=0; i<len; i++) {
			
			if(apt[i] == null) {
				continue;
			}
			
			if(apt[i].getElectricityBill()<min) {
				min = apt[i].getElectricityBill();
				index = i;
			}
		}
		return apt[index].getFlatOwner();
	}
	
	public static double getSecondMinWaterBill(Appartment[] apt) {
		
		if(apt == null) {
			return 0;
		}
		
		int i = 0;
		double first = Double.MAX_VALUE;
		double second = Double.MAX_VALUE;
		int len = apt.length;
		
		for(i=0; i<len; i++) {
			
			if(apt[i] == null) {
				continue;
			}
			
			if(apt[i].getWaterBill() < first) {
				second = first;
				first = apt[i].getWaterBill();
			} else if(apt[i].getWaterBill() < second && apt[i].getWaterBill() != first) {
				second = apt[i].getWaterBill();
			}
		}
		return second;
	}

}
