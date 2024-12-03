/**
 * Represents a CD, which is a type of media.
 * A CD includes details such as its title, release year, price, and the name of the band.
 *
 * @author Giulia Villiger
 */

public class CD extends Media{
    private String bandname;

    /**
     * Constructor for CD with parameters.
     * @param bandname the name of the band associated with the CD
     */
    public CD(String title, int year, double price, String bandname) {
        super(title, year, price);
        this.bandname = bandname;
    }

    @Override
    public void print() {
        System.out.println("CD - Title: " + getTitle() +
                ", Year: " + getYear() +
                ", Price: " + getPrice() +
                ", Band Name: " + bandname);
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bandname='" + bandname + '\'' +
                ' ';
    }
}
