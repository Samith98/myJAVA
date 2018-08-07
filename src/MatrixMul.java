import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns in Matrix 1 respectively:");
		byte rows1 = sc.nextByte();
		byte cols1 = sc.nextByte();
		
		System.out.println("Enter the number of rows and columns in Matrix 2 respectively:");
		byte rows2 = sc.nextByte();
		byte cols2 = sc.nextByte();
		
		byte j = 0;
		byte i = 0;
		byte k = 0;
		
		int mat1[][] = new int [rows1][cols1];
		int mat2[][] = new int [rows2][cols2];
		
		int res[][] = new int [rows1][cols2];
		
		System.out.println("Enter the values of Matrix 1:");
		
		for(i = 0; i < rows1; i++) {
			for(j = 0; j < cols1; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the values of Matrix 2:");
		
		for(i = 0; i < rows2; i++) {
			for(j = 0; j < cols2; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		if(cols1 == rows2) {
			for(i = 0; i < rows1; i++) {
				for(j = 0; j < cols2; j++) {
					for(k = 0; k < cols1; k++) {
						res[i][j] += (mat1[i][k] * mat2[k][j]);
					}
				}
			}
		}
		else {
			System.out.println("The matrix multiplication is not possible.Please check the input data.");
		}
		
		System.out.print("The resultant matrix is: \n");
		
		for(i = 0; i < rows1; i++) {
			for(j = 0; j < cols2; j++) {
				 System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}