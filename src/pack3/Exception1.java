package pack3;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		int a;
  while(true) {
	try {	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.println("You have entered a as : " + a); 
		break;
	} catch(Exception e) {
		System.out.println("Please enter only numbers (Non-Decimal), Try again ");
		//e.printStackTrace();
	} finally {
		System.out.println("I will always execute..");
	}
  }
 
	} // end of main
} // end of class
