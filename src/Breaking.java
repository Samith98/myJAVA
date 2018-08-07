import java.util.Scanner;

public class Breaking {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long odd = 0;
	    long even =0;
	    long input = 0;
	    int res =0;
	    
	    scanf("%l",&input);
	    
	    while(input!=0){
	        
	        res=input%10;
	        if(res%2==0)
	            odd+=res;
	        else 
	            even+=res;
	        input=input/10;
	    }
	    int difference = odd-even;
	    System.out.println(difference);
		}

	}

}
