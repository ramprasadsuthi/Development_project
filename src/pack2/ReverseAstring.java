package pack2;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = input.nextLine();
		
		char a[] = name.toCharArray();
		
		String rname = "";
		int len = name.length();
		
		for(int i=len-1; i>=0; i--) {
			rname = rname + a[i];
		}
		
		System.out.println("Reverse Name is : " + rname);

	} // End of main

} // End of Class

