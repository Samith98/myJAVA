import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		int a = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		byte size = input.nextByte();
		
		int src[] = new int[size];
		
		System.out.println("\nEnter the elements of array:");
		for(i = 0; i < size; i++)
			src[i] = input.nextInt();
		
		for(i = 0; i < size; ++i) {
			for(j = i+1; j < size; ++j) {
				if(src[i] > src[j]) {
					a = src[i];
					src[i] = src[j];
					src[j] = a;
				}
			}
		}
		
		i = 0;
		System.out.println("The second smallest element in the array is:"+src[i+1]);
	}

}
