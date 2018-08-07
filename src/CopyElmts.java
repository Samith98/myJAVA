import java.util.Scanner;

public class CopyElmts {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the Source array:");
		byte size = input.nextByte();
		
		int src[] = new int[size];
		int dst[] = new int[size];
		
		System.out.println("\nEnter the elements of Source array:");
		for(i = 0; i < size; i++) {
			src[i] = input.nextInt();
		}
		
		System.out.println("\nCopying the elements from source to destination.\n");
		for(i = 0; i < size; i++)
			dst[i] = src[i];
		
		System.out.println("The copied elements in the Destination array are:");
		for(i = 0; i < size; i++) {
			System.out.println(dst[i]);
	}
	}
}
