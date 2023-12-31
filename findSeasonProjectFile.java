
/* By Janelle Sampson ID:1204273
 
 Write a program that takes a date as input and
outputs the date's season. The input is a string to
represent the month and an integer to represent the
day.

The program stops when input is Quit. Note: "Quit"
is the one that Stop The Loop.

In addition, check if the string and integer are valid
(an actual month and day).


The dates for each season are:
Spring: March 20 - June 20
Summer: June 21 - September 21
Autumn: September 22 - December 20
Winter: December 21 - March 19

*/

import java.util.*;



public class findSeasonProjectFile {

	
	public static void main(String[] args) {
		
		String loop = "yes";
		//Receive input (date) from user:
		Scanner input = new Scanner(System.in);
		
		while (!loop.equals("Quit")) {
			System.out.print("Enter the month (no abbreviations) and date: ");
			String month = input.next();
			int day = input.nextInt();
	
			// Logic: Determine the seasons and validity of the information given
			switch (month) {
			case "January":
				if (day > 0 && day <32)
				System.out.println("The season is: Winter");
				else {
					System.out.println("Your response is invalid");
				}
			
				break;
				
			case "February":
				if(day > 0 && day < 29)
				System.out.println("The season is: Winter");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "March":
				if (day > 0 && day < 20)
					System.out.println("The season is: Winter");
				else if (day > 19 && day < 32)
					System.out.println("The season is: Spring");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "April":
				if (day > 0 && day <31)
				System.out.println("The season is: Spring");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "May":
				if (day > 0 && day <32)
				System.out.println("The season is: Spring");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "June":
				if (day > 0 && day <21)
					System.out.println("The season is: Spring");
				else if (day > 20 && day <31)
					System.out.println("The season is: Summer");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "July":
				if (day > 0 && day <32)
				System.out.println("The season is: Summer");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "August":
				if (day > 0 && day <32)
				System.out.println("The season is: Summer");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "September":
				if (day > 0 && day <22)
					System.out.println("The season is: Summer");
				else if (day > 21 && day <31)
					System.out.println("The season is: Fall");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "October":
				if (day > 0 && day <32)
				System.out.println("The season is: Fall");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "November":
				if (day > 0 && day <31)
				System.out.println("The season is: Fall");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			case "December": 
				if (day > 0 && day <21)
					System.out.println("The season is: Fall");
				else if (day > 20 && day <32)
					System.out.println("The season is: Winter");
				else {
					System.out.println("Your response is invalid");
				}
				break;
				
			default:
				System.out.println("Your response is invalid");
				break;
				
			};
			
			System.out.print("Would you like to continue?: ");
			loop = input.next(); //something is wrong with this. The variable is not taking the new String.
			
		}
	
		System.out.println("Goodbye! =)");

	}
}

	