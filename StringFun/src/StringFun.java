import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//September 5th, calendar exercise
		//print a date (ex: Tuesday September, 5th
		// use \ to print quotes ex: "\"friends\""
		// \n \t for new line and tab
		
		Scanner input = new Scanner(System.in);
		
		String answer;
		
		String day = "Tuesday";
		
		int date = 5;
		
		String month = "September";
		
		int year = 2023;
				
		System.out.println("The date is " + day + " " + month + " " + date + "th, " + year + ".");
		
		System.out.print("European style is " + day);
		
		System.out.println(" the " + date + "th of " + month + ", " + year + ".");
		
		System.out.println("Do you know what day it is? Please tell me the day!");
		day = input.nextLine();
		
		System.out.println("The day is " + day + ".");
		
		System.out.println("Do you know how to get input?");
		answer = input.nextLine();
		
		System.out.println(answer);
		
		
	}

}
