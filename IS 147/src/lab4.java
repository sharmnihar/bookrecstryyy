/*
Niharika Sharma
Email : n200@umbc.edu
 */
public class lab4 {
    public static void main(String [] args){
        int tenStars = 10;
        printStars(tenStars);
    }
    public static void printStars(int tenStars)
    {
        for (int s = tenStars; s > 0; s--)
        {
            for (int t = 0; t < s; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
