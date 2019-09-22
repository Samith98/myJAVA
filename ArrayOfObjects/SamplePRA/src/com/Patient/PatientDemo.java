package com;

public class PatientDemo {

	public static void main(String[] args) {

		Patient[] patients = new Patient[5];
		
		patients[0] = new Patient(89, "Rahul", 2,'g', 14.0); 
		patients[1] = new Patient(58, "Praveen", 9,'g', 21.0); 
		patients[2] = new Patient(9, "Ashish", 20,'s', 43.0); 
		patients[3] = new Patient(64, "Ishaan", 7,'g', 13.0); 
		patients[4] = new Patient(19, "Teja", 18,'s', 32.0); 
				
		try {

			Expense expense1[] = PatientDemo.calculateExpense(patients); 
				
			for( Expense p : expense1) { 
				System.out.println("ExpenseId "+p.getExpenseId()+" of price "+p.getPrice()); 
			} 
				
			Patient[] patients1 =PatientDemo.sortById(patients,'g'); 
			if(patients1!=null ) { 
				for( Patient p : patients1) { 
					System.out.println("Patient Id "+p.getPatientId()+"TCS Internal Patient Name"+p.getPatientName()+" No. of days "+p.getTotalNoOfDays()); 
				} 
			} 
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Expense[] calculateExpense(Patient[] patient) {
		
		if(patient == null) {
			return null;
		}
		
		int len = patient.length;
		Expense[] expenses = new Expense[len];
		
		int i = 0;
		
		for(i=0; i<len; i++) {
			
			if(expenses[i] == null) {
				continue;
			}
			
			String name = patient[i].getPatientName();
			int eId = patient[i].getPatientId() + name.length();
			expenses[i].setExpenseId(eId);
		}
		
		for(i=0; i<len; i++) {
			
			if(patient[i] == null) {
				continue;
			}
			
			double p = 0;
			
			if(patient[i].getWard() == 'g') {
				p = patient[i].getTotalNoOfDays() * 1000;
			}
			if(patient[i].getWard() == 's') {
				p = patient[i].getTotalNoOfDays() * 2000;
			}
			
			double price = p + ((patient[i].getTaxPercentage()/100)*p);
			expenses[i].setPrice(price);
		}
		return expenses;
	}
	
	
	public static Patient[] sortById(Patient[] patient , char ward) {
		
		if(patient == null) {
			return null;
		}
		
		int i = 0;
		int len = patient.length;
		int count = 0;
		
		for(i=0; i<len; i++) {
			if(patient[i].getWard() == ward) {
				count++;
			}
		}
		
		Patient[] newPatient = new Patient[count];
		int j = 0;
		for(i=0; i<len; i++) {
			if(patient[i].getWard() == ward) {
				newPatient[j] = patient[i];
			}
		}
		return newPatient;
	}
}