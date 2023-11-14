/* Niharika Sharma
E-mail : n200@umbc.edu */

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        int age;
        char isFtimeOrPtime;
        double hoursWorked, payRate, grossPay, taxPaid, netPayment;
        boolean vacationRequest = true ;
        double taxRate = 0.10;

        System.out.println("Welcome to the IS147 Payroll System in JAVA");
        System.out.println("Please follow the instrauctions provided on the screen");
        System.out.println("-------------------------------------------------------------");
        System.out.println("What is your name?:");
        name = in.nextLine();
        System.out.println("What is your age?:");
        age = in.nextInt();
        System.out.println("Press F for Full time or P for Part time?:");
        isFtimeOrPtime = in.next().charAt(0);
        System.out.println("How many hours did you work this week?:");
        hoursWorked = in.nextDouble();
        System.out.println("What is your hourly pay rate?:");
        payRate = in.nextDouble();

        grossPay = hoursWorked * payRate;
        taxPaid = grossPay * taxRate;
        netPayment = grossPay - taxPaid;

        System.out.println("*************************************************************");
        System.out.println("Hello, " + name + " You are: " + age + "years old");
        System.out.println("Your Employment Status is: " + isFtimeOrPtime);
        System.out.println("Vacation request: " + vacationRequest);
        System.out.println("Your Tax Rate: " + taxRate);


        System.out.println("Pay Rate per hour: " + payRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Tax paid: " + taxPaid);
        System.out.println("----------------------------------");
        System.out.println("Net pay: " + netPayment);
        System.out.println("*************************************************************");
    }
}
