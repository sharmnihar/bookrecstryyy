import java.util.Scanner;

public class BookRecommendationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("\nWelcome, " + name + "!\n");

        while (true) {
            // Display genres
            System.out.println("Genres:");
            System.out.println("1. Fantasy Fiction");
            System.out.println("2. Historical Fiction");
            System.out.println("3. Thriller/Horror");
            System.out.println("4. Non-Fiction");
            System.out.println("5. Science Fiction");

            System.out.print("\nEnter the number corresponding to your chosen genre (or type 'exit' to quit): ");
            String genreChoice = scanner.nextLine();

            if ("exit".equalsIgnoreCase(genreChoice)) {
                System.out.println("Exiting the program. Goodbye, " + name + "!");
                break;
            }

            // Display book recommendations for the chosen genre
            bookRecs(genreChoice);

            // Enter a loop for book summaries
            while (true) {
                System.out.print("\nEnter the number of the book you want to know more about (or type 'exit' to go back to genres): ");
                String bookChoice = scanner.nextLine();

                if ("exit".equalsIgnoreCase(bookChoice)) {
                    // Exit the book summary loop and go back to genre selection
                    break;
                }

                // Assume the user picked the first book for simplicity
                String selectedBook = getBookSummary(genreChoice, bookChoice);

                if (selectedBook != null) {
                    System.out.println("\nSummary of the Book you selected in the " + genreChoice + " genre:");
                    System.out.println(selectedBook);
                } else {
                    System.out.println("Invalid book choice. Please try again.");
                }
            }
        }

        scanner.close();
    }

    private static void bookRecs(String genre) {
        // Your existing book recommendation logic goes here
        // ...

        System.out.println("\nRecommended Books in the " + genre + " genre:");
        // Assume displaying 5 books for simplicity
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". [Book Title " + i + "]");
        }
    }

    private static String getBookSummary(String genre, String bookChoice) {
        // Your logic to retrieve the summary based on the genre and book choice goes here
        // ...

        // Assume returning a sample summary for simplicity
        switch (bookChoice) {
            case "1":
                return "[Summary of Book Title 1]";
            // Add cases for other books as needed
            default:
                return null;
        }
    }
}