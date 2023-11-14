package HOMEWORK;/*
Niharika Sharma
E-mail: n200@umbc.edu
HOMEWORK 1 pt 2
 */

public class HWpt2 {
    public static void main (String []args){

        //comparison operators(==,!=,>,<, <=,>=)

        String cOne = "Niharika";
        String cTwo = "niharika";
        boolean eOne = cOne == cTwo;
        System.out.println("\nString comparision (Equals): " + eOne);  // ==

        boolean nOne = cOne != cTwo;
        System.out.println("String comparision (Not Equals): " + nOne); // !=

        double gOne = 8932;
        double gTwo = 48655;
        boolean greaterOne = gOne > gTwo;
        System.out.println("String comparision (Greater than): " + greaterOne); // >

        double fOne = 254;
        double fTwo = 231;
        boolean lessOne = fOne < fTwo;
        System.out.println("String comparision (Equals): " + lessOne); // <

        double yOne = 5228;
        double yTwp = 96323;
        boolean eqOne = gOne <= gTwo;
        System.out.println("String comparision (Equals): " + eqOne); // <=

        double oOne = 213;
        double oTwo = 1895;
        boolean eqTwo = oOne >= oTwo;
        System.out.println("String comparision (Equals): " + eqTwo); // >=
    }

}
