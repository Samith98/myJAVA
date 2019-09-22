import java.util.Scanner;

public class Breaking {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long odd = 0;
	    long even =0;
	    long input1 = 0;
	    int res =0;
	    
	    input1 = input.nextLong();
	    
	    while(input1!=0){
	        
	        res=(int) (input1%10);
	        if(res%2==0)
	            odd+=res;
	        else 
	            even+=res;
	        input1=input1/10;
	    }
	    int difference = (int) (odd-even);
	    System.out.println(difference);
		}

	}
