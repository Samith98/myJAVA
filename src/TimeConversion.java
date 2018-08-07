import java.util.Scanner;
import java.lang.*;

public class TimeConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("Enter the time in (hh:mm:ss)AM/PM format:\n");
		String time1 = input.next();
		
		String[] dateArray = time1.split(":");
		
		int hour = Integer.parseInt(dateArray[0]);
		int min = Integer.parseInt(dateArray[1]);
		int sec = Integer.parseInt(dateArray[2]);
		String meridian = dateArray[3];
		
		if(min >= 60)
			System.out.println("\nEnter valid number of minutes.");
		else if(sec >= 60)
			System.out.println("\nEnter valid number of seconds.");
		else {		
			if(meridian.equals("PM"))
					hour += 12;
			
		String time = String.valueOf(hour) +":"+ String.valueOf(min) +":"+ String.valueOf(sec);
		System.out.println("\nThe time is "+ time);
		}
	}
}
