import java.lang.String;
import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		
		int i = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines in the input:");
		int lines = input.nextInt();
		
		String passage = new String();
		
		System.out.println("Enter the passage:");
		for(i = 0; i <= lines; i++)
			passage = input.nextLine();
		
		
		for(i = 0; i < passage.length()-1; i++)
			if(passage.charAt(i) == ' ' && passage.charAt(i+1) != ' ')
				count++;
		System.out.print("\nThe number of words in the passage is: "+ ++count);
	}
}
