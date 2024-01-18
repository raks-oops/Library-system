package items;

public class Book implements LibraryItem{
    private String title;
    private String uniqueId;
    private String author;
    private double value;

    public Book(String title, String uniqueId, String author, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public int calculateLateFee(int days) {
        return days * 15;
    }

    @Override
    public double getValue() {
        return this.value;
    }

}
