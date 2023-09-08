import java.util.Scanner;

public class TemperatureConversion {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	double ftemp;
	
	double ctemp;
	
	double ktemp;
	
	System.out.println("Enter a Fahrenheit temperature:");
	ftemp = input.nextDouble();
	
	ctemp = (ftemp - 32) * (5.0/9);
	
	ktemp = (ctemp + 273.15);
	
	System.out.printf(ftemp + " degrees Fahrenheit is " + ctemp + " degrees Celsius and is " + ktemp + " degrees Kelvin.");
	
}
}