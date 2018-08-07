import java.util.Scanner;


public class DuplicateValue {

	public static void main(String[] args) {
		
		int i = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		byte size = input.nextByte();
		
		int src[] = new int[size];
		
		System.out.println("\nEnter the elements of array:");
		for(i = 0; i < size; i++)
			src[i] = input.nextInt();
		
		System.out.println("Enter the value to be checked for duplicates:");
		byte check = input.nextByte();
		
		for(i = 0; i < size; i++) {
			if(src[i] == check)
				++count;
		}
		
		if(count >= 2)
			System.out.println("The value "+check+" has "+ count+" duplicate values in the array.");
		else
			System.out.println("The value "+check+" has no duplicate values in the array.");
	}

}
