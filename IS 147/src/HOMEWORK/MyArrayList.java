/*
Niharika Sharma
E-mail: n200@umbc.edu
*/

public class MyArrayList {

    public void printMyArray(int[] arr) {
        for (int numbA : arr) {
            System.out.print(numbA + " ");
        }
        System.out.println();
    }

    public void printMyArray(double[] arr) {
        for (double numbB : arr) {
            System.out.print(numbB + " ");
        }
        System.out.println();
    }

    public void printMyArray(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        int[] intArray = {1, 2, 3, 4, 5, 6};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        char[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.print("\nArray integerArray contains: \n");
        myArrayList.printMyArray(intArray);
        System.out.print("\nArray doubleArray contains: \n");
        myArrayList.printMyArray(doubleArray);
        System.out.print("\nArray CharacterArray contains: \n");
        myArrayList.printMyArray(charArray);
    }
}