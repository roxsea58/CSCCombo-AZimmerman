import java.util.Scanner;

public class InputCheckSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;
		
		//-----------------------------------------------------------------
		
		System.out.print("the words go here");
		
		word = input.nextLine();
		
		System.out.println("The words in all caps are: " + word.toUpperCase());
		
		//-----------------------------------------------------------------

		realNum = 987654321.987654321f;
		
		realNum = realNum + realNum;
		
		System.out.printf("%.9f", realNum);
		
		//result is 1975308672.000000000
		
		//-----------------------------------------------------------------

		biggerRealNum = 987654321.987654321;

		biggerRealNum = biggerRealNum + biggerRealNum;

		System.out.printf("\n%.9f", biggerRealNum);
		// result is 1975308643.975308700
		
		//-----------------------------------------------------------------
		
		System.out.print("the words go here");
		
		word = input.nextLine();
		
		System.out.println("The word goes here " + word);
			
		System.out.print("the int numbers go here");
		
		intNum = input.nextInt();
		
		System.out.println("The int number goes here " + intNum);
		
		System.out.print("the real numbers go here");
		
		realNum = input.nextFloat();
		
		System.out.println("The real number goes here " + realNum);
		
		System.out.print("the bigger real numbers go here");
		
		biggerRealNum = input.nextFloat();
		
		System.out.printf("$%.2f", biggerRealNum);
		
		//-----------------------------------------------------------------
		
		//A string is entered when the computer is expecting an integer:
		
		//	Exception in thread "main" java.util.InputMismatchException
		//		at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		//		at java.base/java.util.Scanner.next(Scanner.java:1594)
		//		at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
		//		at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
		//		at InputCheckSheet.main(InputCheckSheet.java:25)
		
		//A string is entered when the computer is expecting a float:
		
		//	Exception in thread "main" java.util.InputMismatchException
		//		at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		//		at java.base/java.util.Scanner.next(Scanner.java:1594)
		//		at java.base/java.util.Scanner.nextFloat(Scanner.java:2496)
		//		at InputCheckSheet.main(InputCheckSheet.java:31)
		
		//A string is entered when the computer is expecting a double:
		
		//	Exception in thread "main" java.util.InputMismatchException
		//		at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		//		at java.base/java.util.Scanner.next(Scanner.java:1594)
		//		at java.base/java.util.Scanner.nextFloat(Scanner.java:2496)
		//		at InputCheckSheet.main(InputCheckSheet.java:37)
		
	}

}
