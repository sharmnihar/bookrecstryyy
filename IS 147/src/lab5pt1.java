/*Niharika Sharma
E-mail: n200@umbc.edu
 */
import java.util.Scanner;

public class lab5pt1 {
    public static int Addition (int a, int b)
    {return a + b;}
    public static int Subtraction (int a, int b)
    {return a - b;}
    public static int Multiplication (int a, int b)
    {return a * b;}
    public static double Division (double a, double b)
    {
        if (b != 0) {
            return a/b;
        }
        else {
            System.out.println("Error! Please input a number other than 0.");
            return Double.NaN;
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Input a number");
        int firstChoice = sc.nextInt();

        System.out.println("Input a number");
         int secondChoice = sc.nextInt();

        int additionOutcome = Addition (firstChoice, secondChoice);
        int subtractionOutcome = Subtraction (firstChoice, secondChoice);
        int multiplicationOutcome = Multiplication (firstChoice, secondChoice);
        double divisionOutcome = Division (firstChoice, secondChoice);

        System.out.println("Additon: " + additionOutcome);
        System.out.println("Subtraction: " + subtractionOutcome);
        System.out.println("Multiplication: " + multiplicationOutcome);
        System.out.println("Division: " + divisionOutcome);
    }
}
