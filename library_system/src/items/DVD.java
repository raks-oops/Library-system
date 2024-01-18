package items;

public class DVD implements LibraryItem{
    private String title;
    private String uniqueId;
    private String artist;
    private double value;

    public DVD(String title, String uniqueId, String artist, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.artist = artist;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public int calculateLateFee(int days) {
        return days * 25;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}