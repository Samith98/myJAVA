import java.util.Scanner;

public class DeleteElmt {

	public static void main(String[] args) {
		
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		byte size = input.nextByte();
		
		int []arr = new int[size];
		
		System.out.println("Enter the elements of the array:");
		for(i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the value to delete:");
		byte delete = input.nextByte();
		
		System.out.println("The elements of the array before deleting:");
		for(i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		for(i = 0; i < size; i++)
			if(arr[i] == delete)
				break;
		
		size = (byte) (size - 1);
		
		for(byte j = (byte) i; j<size; j++)
			arr[j] = arr[j+1];
		
		System.out.println("The elements of the array after deleting:");
		for(i = 0; i < size; i++) {
			System.out.println(arr[i]);
	}
	}
}
