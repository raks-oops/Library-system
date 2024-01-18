package segregate;

public class LateFeeCalculator {

    /**
     * late fee calculator
     */

    public double calculateLateFee(LateFeeCalculatable[] items, int days) {
        double totalLateFee = 0;
        for (LateFeeCalculatable item : items) {
            totalLateFee += item.calculateLateFee(days);
        }
        return totalLateFee;
    }
}
