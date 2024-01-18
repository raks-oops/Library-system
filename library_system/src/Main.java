import items.*;
import segregate.*;

public class Main {
    public static void main(String[] args) {
        // Create some library items
        Book book = new Book("The Great Gatsby", "1", "F. Scott Fitzgerald", 30.0);
        CD cd = new CD("Thriller", "2", "Michael Jackson", 20.0);
        DVD dvd = new DVD("The Godfather", "3", "Francis Ford Coppola", 25.0);

        // Add the items to an array
        LibraryItem[] items = {book, cd, dvd};

        // Create a library with the items
        Library library = new Library(items);

        // Calculate the total value of the items in the library
        double totalValue = library.calculateTotalValue(items);
        System.out.println("Total value of the items in the library: " + totalValue);

        // Calculate the total late fee for the items for 5 days
        LateFeeCalculator lateFeeCalculator = new LateFeeCalculator();
        double totalLateFee = lateFeeCalculator.calculateLateFee(items, 5);
        System.out.println("Total late fee for the items for 5 days: " + totalLateFee);
    }
}
