package HOMEWORK;/*
Niharika Sharma
Email : n200@umbc.edu
 */
import java.util.Scanner;

public class hw2 {
public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    int userChoice;
    System.out.println("Enter a number: ");
    double firstNum = scanner.nextDouble();
    System.out.println("Good. Now Enter another number: ");
    double secondNum = scanner.nextDouble();

    do {
        System.out.println("---------- MENU ----------");
        System.out.println("Enter 0 to Quit");
        System.out.println("Enter 1 to Add");
        System.out.println("Enter 2 to Subtract");
        System.out.println("Enter 3 to Multiply");
        System.out.println("Enter 4 Divide");

        userChoice = scanner.nextInt();

        if (userChoice == 0){
            System.out.println("ERROR!");
            break;
        }
        switch (userChoice){
            case 1:
                System.out.println("Output: " + (firstNum + secondNum));
                break;
            case 2:
                System.out.println("Output: " + (firstNum - secondNum));
                break;
            case 3:
                System.out.println("Output: " + (firstNum * secondNum));
                break;
            case 4:
                if (secondNum == 0) {
                    System.out.println("Enter any number other than 0");
                }
                else {
                    System.out.println("Output: " + (firstNum / secondNum));
                    break;
                }
              }

    }
while(true);
    }
}