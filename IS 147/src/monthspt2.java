/*
Niharika Sharma
E-mail: n200@umbc.edu
PART 2
 */
import java.util.Scanner;

public class monthspt2 {
    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);

        System.out.println("\nEnter a number from 1 to 12: ");

        int numMonth = sc.nextInt();

        if(numMonth == 1) {
            System.out.println("January");
        }
        else if (numMonth == 2) {
            System.out.println("February");
        }
        else if (numMonth == 3) {
            System.out.println("March");
        }
        else if (numMonth == 4) {
            System.out.println("April");
        }
        else if (numMonth == 5) {
            System.out.println("May");
        }
        else if (numMonth == 6) {
            System.out.println("June");
        }
        else if (numMonth == 7) {
            System.out.println("July");
        }
        else if (numMonth == 8) {
            System.out.println("August");
        }
        else if (numMonth == 9) {
            System.out.println("September");
        }
        else if (numMonth == 10) {
            System.out.println("October");
        }
        else if (numMonth == 11) {
            System.out.println("November");
        }
        else if (numMonth == 12) {
            System.out.println("December");
        }
        else {
            System.out.println("\nERROR! Please try again.");
        }
    }
}