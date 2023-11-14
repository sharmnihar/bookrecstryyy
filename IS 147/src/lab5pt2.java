/* Niharika Sharma
E-mail: n200@umbc.edu
 */
public class lab5pt2 {
    public static void main(String[] args) {
        printMyName();

        Book myBook = new Book();

        String authorName = myBook.getAuthorName();
        System.out.println("The Author of this book: " + authorName);

        String bookName = myBook.getBookName();
        System.out.println("The Title of this book is: " + bookName);

        int pageNum = myBook.getPageNum();
        System.out.println("The page number: " + pageNum);

        boolean worthReading = myBook.isWorthReading();
        System.out.println("Is the book worth reading? " + worthReading);

        double priceOfTheBook = myBook.getPriceOfTheBook();
        System.out.println("The price of this book is: $" + priceOfTheBook);
    }

    public static void printMyName() {
        System.out.println("\nMy name is Niharika Sharma");
    }

    // Private variables
    static class Book {
        private String authorName = "H. D. Carlton";
        private String bookName = "Haunting Adeline";
        private int pageNum = 508;
        private boolean worthReading = true;
        private double priceOfTheBook = 24.32;

        public String getAuthorName() {
            return authorName;
        }

        public String getBookName() {
            return bookName;
        }

        public int getPageNum() {
            return pageNum;
        }

        public boolean isWorthReading() {
            return worthReading;
        }

        public double getPriceOfTheBook() {
            return priceOfTheBook;
        }
    }
}