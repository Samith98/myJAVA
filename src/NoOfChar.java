import java.util.Scanner;
import java.lang.String;

public class NoOfChar {
	
	static final int MaxChar = 256;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word:");
		String str = input.next();
		
		int i = 0;
		int[] count = new int[MaxChar];
				
		int len = str.length();
		
		for(i = 0; i < len; i++)
			count[str.charAt(i)]++;
		
		char ch[] = new char[str.length()];
		
		for(i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for(int j = 0; j <= i; j++) {
				if(str.charAt(i) == ch[j])
					find++;
			}
			if(find == 1)
				System.out.println("Number of occurences of '"+str.charAt(i)+"' is: "+count[str.charAt(i)]);
		}
	}
}
