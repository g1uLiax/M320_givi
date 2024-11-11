public class Media {
    private String title;
    private int year;
    private double price;
    public Media(String title, int year, double price) {
        this.title = title;
        this.price = price;
        this.year = year;
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
