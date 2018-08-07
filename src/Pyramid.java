import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		byte rows = 0;
		byte i = 0;
		byte j = 0;
		
		System.out.println("Enter the number of rows to be printed:");
		rows = input.nextByte();
		
		for(i = 0; i < rows; i++) {
			for(byte space = 1; space < rows - i; ++space)
				System.out.print(" ");
			
			for(j = 0; j <= i; j++)
				System.out.print("1 ");
			System.out.println();
		}
	}
}
