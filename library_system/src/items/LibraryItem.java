package items;


/**
 * Single responsibility principle
 */

public interface LibraryItem {
    String getTitle();
    String getUniqueId();
    int calculateLateFee(int days);
    double getValue();

}
