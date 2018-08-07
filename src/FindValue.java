import java.util.Scanner;

public class FindValue {

	public static void main(String[] args) {
		
		int i = 0;
		boolean status = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		byte size = input.nextByte();
		
		int []arr = new int[size];
		
		System.out.println("Enter the elements of the array:");
		for(i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the value to be found:");
		byte check = input.nextByte();
		
		for(i = 0; i < size; i++) {
			if(arr[i] == check) {
				System.out.println("Value found at arr["+i+"].");
				status = true;
				break;	
			}
		if(status != false) 
			System.out.println("The value was not found in the array of elements.");
		}
	}
}