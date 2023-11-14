/*Niharika Sharma
Email : n200@umbc.edu */
public class lab7 {
    public static void main (String[] args){

               String[][] courses = {
                    {"\nIS147: Programming in Java I Room 100"},
                    {"----------------------------------------------"},
                    {"IS247: Programming Java II Room 200"},
                    {"----------------------------------------------"},
                    {"IS410: Database Programming I Room 300"},
                    {"----------------------------------------------"},
                    {"IS420: Database Programming II Room 400"},
                    {"----------------------------------------------"} };

            System.out.printf("%-10s%-10s%-10s\n", "CourseNumber |", "Course Name |", "Room");

            for (int s = 0; s < courses.length; s++) {
                for (int c = 0; c < courses[s].length; c++) {
                    System.out.printf("%-15s", courses[s][c]);
                }
                System.out.println("");
            }
        }
    }