package HOMEWORK;/*
Niharika Sharma
E-mail: n200@umbc.edu
HOMEWORK 1 pt 1
 */

public class HWpt1 {
    public static void main (String [] args) {

        // following arithmetical operators(+ ,-,*,/,%,++,--)

        // +
        String sOne= "IS";
        String sTwo="147";
        String sThree = "Mondays: 7:10-9:40pm";

        // -
        byte numOne = 90;
        byte numTwo = 58;

        // *
        double mOne = 82;
        double mTwo = 215;

        // /
        double dOne = 1583;
        double dTwo = 56;

        // %
        double pOne = 367;
        double pTwo = 56;

        //++ and --
        int pNum = 89;

        System.out.println("\n"+ sOne + sTwo + "; " + sThree + " : Addition"); // +
        System.out.println(numOne - numTwo + " : Subtracton"); // -
        System.out.println(mOne * mTwo + " : Multiplication"); // *
        System.out.println(dOne / dTwo + " : Division"); // /
        System.out.println(pOne % pTwo + " : Modules"); // %
        System.out.println(++pNum + " : Increment"); // ++
        System.out.println(--pNum + " : Decrement"); // --
    }
}