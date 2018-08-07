import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Enter the input:");
		num = input.nextInt();
		
		for(byte i = 1; i <= num; i++)
			System.out.println("The number is:"+i+" 10and it's cube is:"+(i*i*i));
	}
}
