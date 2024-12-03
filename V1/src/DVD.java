/**
 * Class DVD is a child or Media and represents a DVD.
 * @author Giulia Villiger
 */
public class DVD extends Media{
    private int lengthInMinutes;

    /**
     * Constructor for DVD with parameters.
     *
     * @param year              the year the DVD was released
     * @param title             the name of the DVD
     * @param price             the price of the DVD
     * @param lengthInMinutes   the length of the DVD in minutes
     */
    public DVD(String title, int year, double price, int lengthInMinutes) {
        super(title, year, price);
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public void print() {
        System.out.println("DVD - Title: " + getTitle() +
                ", Year: " + getYear() +
                ", Price: " + getPrice() +
                ", Length: " + lengthInMinutes + " minutes");
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
   @Override
    public String toString() {
        return super.toString() +
                "lengthInMinutes=" + lengthInMinutes +
                ' ';
    }
}
