import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep1 {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a: ");
                a = input.nextInt();
                System.out.println("You have entered a as: " + a);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number only (Non-Decimal)..");
                input.next(); // Clear the invalid input
            } finally {
                System.out.println("---> In case of invalid input try again <---");
            }
        }
        input.close();
        System.out.println("---> PROGRAM ENDS <---");
    }
}
