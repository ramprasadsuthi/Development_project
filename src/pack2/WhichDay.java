package pack2;
import java.util.Scanner;
public class WhichDay {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Please enter your day number (1 - 7) : ");
        int day = input.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "an Invalid day";
                break;
        }
        System.out.println("You have entered Day " + day + " and it is " + dayName);
    } // End of main
} // End of class
