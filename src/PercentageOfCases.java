import java.util.Scanner;

public class PercentageOfCases {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int countUpper = 0;
		int countLower = 0;
		float upper = 0;
		float lower = 0;
		
		System.out.println("Enter the String:");
		String str = input.next();
		
		int len = str.length();
		
		for(int i = 0; i < str.length(); i++) {

			if(Character.isUpperCase(str.charAt(i)))
				countUpper++;
			if(Character.isLowerCase(str.charAt(i)))
				countLower++;
		}
		
		upper = (countUpper/len)*100;
		lower = (countLower/len)*100;
		
		System.out.println("The percentage of Uppercae is "+upper+"%");
		System.out.println("The percentage of Lowercase is "+lower+"%");
	}
}
