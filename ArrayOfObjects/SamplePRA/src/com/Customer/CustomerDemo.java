package com;

public class CustomerDemo {

	public static void main(String[] args) {
		
		//Declaring an Customer Array:
		Customer[] cust = new Customer[5];
		int i=0;
		
		//Initializing each Object in an Array:
		cust[0] = new Customer(1, "abc", "m", 21);
		cust[1] = new Customer(2, "fgh", "f", 35);
		cust[2] = new Customer(3, "der", "m", 27);
		cust[3] = new Customer(4, "poi", "f", 40);
		cust[4] = new Customer(5, "awq", "m", 30);
		
		//1. Finding Customer by ID
		int cId = 6;
		try {					//Must add try - catch block if the ID does not match, because it return null.
		Customer newCust = CustomerDemo.findCustomerById(cust, cId);
		System.out.println("Finding Customer By ID:");
		System.out.println(newCust.getCustName());
		} catch(Exception e) {
			System.out.println("No Customer exists with ID:"+" "+cId);
		}
		System.out.println();
		
		//2. Sorting Customer By Age
		Customer[] sortedCust = CustomerDemo.sortCustomerByAge(cust);
		System.out.println("Sorting Customer By Age:");
		for(i=0; i<sortedCust.length; i++) {
			System.out.println(sortedCust[i].getCustName());
		}
		System.out.println();
		
		//3. Finding Eldest Customer
		Customer eCust = CustomerDemo.findEldestCustomer(cust);
		System.out.println("Finding Eldest Customer:");
		System.out.println(eCust.getCustName());
		System.out.println();
		
		//4. Replacing Customer by ID
		int j=0;
		Customer nCust = new Customer(3, "dtf", "f", 45);
		CustomerDemo.replaceCustomerById(cust, nCust);
		System.out.println("Replacing Customer By ID:");
		for(j=0; j<cust.length; j++) {
			System.out.println(cust[j].getCustId()+" "+cust[j].getCustName()+" "+cust[j].getGender()+" "+cust[j].getAge());
		}
		System.out.println();
		
		//5. Finding Customer more than average age
		int k=0;
		Customer[] avgCust = CustomerDemo.findCustomerMoreThanAverageAge(cust);
		System.out.println("Finding Customer More Than Average Age:");
		for(k=0; k<avgCust.length; k++) {
			System.out.println(avgCust[k].getCustId()+" "+avgCust[k].getCustName()+" "+avgCust[k].getGender()+" "+avgCust[k].getAge());
		}
		System.out.println();
	}

	//Method to find the customer by his ID
	public static Customer findCustomerById(Customer[] cust, int cId) {

		//Check if the customer array is null or not, if null return null value back
		//otherwise continue the process.
		if(cust == null) {
			return null;
		}
		
		int i=0;
		int len = cust.length;
		for(i=0; i<len; i++) {
			if(cust[i] == null) { 			   	//Check if each object is null, if it null continue to next object
				continue;		   			   	//otherwise proceed to next step.
			}
			if(cust[i].getCustId() == cId) {   	//find the customer with ID cId in customer array cust[].
				return cust[i];				   	//return the found customer object if it is found.
			}
		}
		
		return null;							//this will return null if there is no customer with Id cId
	}
	
	//Method to sort the customer array by age
	public static Customer[] sortCustomerByAge(Customer[] c) {
		
		if(c == null) {
			return null;
		}
		
		int i=0;
		int j=0;
		int len = c.length;						
		Customer temp;
		for(i=0; i<len; i++) {
			if(c[i] == null) {
				continue;
			}
			for(j=i+1; j<len; j++) {			//To arrange the array in ascending order
				if(c[i].getAge() > c[j].getAge()) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;	
				}
			}
		}
		return c;
	}
	
	//Method to find Eldest Customer
	public static Customer findEldestCustomer(Customer[] cust) {
		
		if(cust == null) {
			return null;
		}
		
		int i=0;
		int index=0;
		int max=Integer.MIN_VALUE;		//A variable with the least value of it's data type using MIN_VALUE function
		int len = cust.length;
		for(i=0; i<len; i++) {
			if(cust[i].getAge()>max) {	//Finding the Eldest customer
				index = i;
				max = cust[i].getAge();
			}
		}
		
		return cust[index];
	}
	
	//Method to replace customer by ID
	public static Customer[] replaceCustomerById(Customer[] cust, Customer newCust) {
		
		if(cust == null) {
			return null;
		}
		int i=0;
		int len = cust.length;
		for(i=0; i<len; i++) {
			if(cust[i] == null) {
				continue;
			}
			if(cust[i].getCustId() == newCust.getCustId()) {
				cust[i] = newCust;
			}
		}
		
		return cust;
	}
	
	//Method to find the customer more than average age
	public static Customer[] findCustomerMoreThanAverageAge(Customer[] c) {
		
		if(c == null) {
			return null;
		}
		int i=0;
		int j=0;
		int len=c.length;
		int sum=0;
		int avg=0;
		int count=0;
		for(i=0; i<len; i++) {				
			if(c[i] == null) {				
				continue;
			}
			sum+=c[i].getAge();				//Adding the ages of the customers in the array
		}
		avg = sum/len;						//Calculating the average age of the customer array
		
		for(i=0; i<len; i++) {
			if(c[i] == null) {
				continue;
			}
			if(c[i].getAge()>=avg) {		//Counting the number of customers whose age is
				count++;					//greater than the average age 
			}
		}
		
		Customer[] aCust = new Customer[count];
		
		for(i=0; i<len; i++) {
			if(c[i] == null) {
				continue;
			}
			if(c[i].getAge()>=avg) {
				aCust[j] = c[i];			//Copying the customer details whose age is more than
				j++;						//more than average age to a new array
			}
		}
		
		return aCust;
	}
}