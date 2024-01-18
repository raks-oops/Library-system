package items;


import segregate.LateFeeCalculatable;

/**
 * Single responsibility principle
 */

public interface LibraryItem extends LateFeeCalculatable {
    String getTitle();
    String getUniqueId();
    double getValue();

}
