/**
 * Parent Class Media, contains constructor, getter and setter, print function
 * @author Giulia Villiger
 */
public class Media {
    private String title;
    private int year;
    private double price;

    /**
     * Constructor for a Book with parameters
     *
     * @param title    the title of the Media
     * @param year     the release year of the Media
     * @param price    the price of the Media
     */
    public Media(String title, int year, double price) {
        this.title = title;
        this.price = price;
        this.year = year;
    }

    /**
     * The print function is responsible for printing all
     * the Attributes of a Media.
     */
    public void print() {
        System.out.println("Title: " + title +
                ", Year: " + year +
                ", Price: " + price);
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ' ';
    }
}
