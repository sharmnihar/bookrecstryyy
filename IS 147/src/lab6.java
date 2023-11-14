/*Niharika Sharma
E-mail: n200@umbc.edu
 */

import java.util.Scanner;

public class lab6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double  [] numOfSales = new double[7];
        for (int s = 0; s < 7; s++) {
            System.out.println("\nEnter sales amount for day: " + (s + 1));
            numOfSales[s] = scanner.nextDouble();
        }
        System.out.println("\n\nSales for 7 days ");
        System.out.println("__________________________");
        for (int s = 0; s < 7; s++) {
            System.out.println("Day " + (s + 1) + " Sales " + numOfSales[s]);
        }
        double totalNum = 0;
        for (double numOfSalestotal : numOfSales) {
            totalNum += numOfSalestotal;
        }
        System.out.println("\n\nTotal Sales: " + totalNum);
    }

}