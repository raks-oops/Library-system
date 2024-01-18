package segregate;

import items.LibraryItem;

public class Library {

    private LibraryItem[] items;

    public Library(LibraryItem[] items) {
        this.items = items;
    }

    /**
     * Calculate the total value of the items in the library
     */
    public double calculateTotalValue(LibraryItem[] items) {
        double totalValue = 0;
        for (LibraryItem item : items) {
            totalValue += item.getValue();
        }
        return totalValue;
    }
}
