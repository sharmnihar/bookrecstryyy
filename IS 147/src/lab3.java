/*
Niharika Sharma
E-mail: n200@umbc.edu
LAB 3
 */

import java.util.Scanner;
import java.util.Random;

public class lab3 {
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter your First Name: ");
        String fName = scanner.nextLine();
        char lastLofFirstName = Character.toUpperCase(fName.charAt((fName.length() - 1)));
        System.out.println(lastLofFirstName);

        System.out.println("\nEnter your last name and press enter: ");
        String lName = scanner.nextLine();

        Random ran = new Random();
        int ranNumber = ran.nextInt(90) + 10;

        String threeFirstLettersoflastName = lName.substring(0, Math.min(lName.length(), 3)).toLowerCase();

        String fpassword = lastLofFirstName + String.valueOf(ranNumber)+threeFirstLettersoflastName;

        System.out.println("\nYour password is: " + fpassword);
        fpassword += "****";
        System.out.println("Your password after using concat: " + fpassword);

        StringBuilder revfPassword = new StringBuilder(fpassword);
        revfPassword.reverse();

        System.out.println("Your password after reverse: " + revfPassword);
    }
}
