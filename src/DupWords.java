import java.lang.String;
import java.util.Scanner;

public class DupWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines in the input:");
		int lines = input.nextInt();
		
		String passage = new String();
		
		System.out.println("Enter the passage:");
		for(int i = 0; i <= lines; i++)
			passage = input.nextLine();
		
		System.out.println("Enter the word to be found:");
		String check = input.next();
		
		String temp = passage.trim();
		
		if(temp.contains(check))
			System.out.println("The word "+check+" is found in the given passage.");
		else
			System.out.println("The word is not found in the given passage.");
	}

}
