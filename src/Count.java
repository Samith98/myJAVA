import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int num1 = 0;
		int count = 0;
		
		System.out.println("Enter a number without ZERO:");
		num = input.nextInt();
		
		while(num > 0) {
			num1 = num%10;
			num = num/10;
			count++;
		}
		System.out.println("The number of digits in the input number is: "+count);
	}

}
