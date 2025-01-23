/**
 * Class Book is a child or Media and represents a Book.
 * @author Giulia Villiger
 */
public class Book extends Media{
    private int pages;
    private int num_ISBN;

    /**
     * Constructor for Book with parameters.
     *
     * @param price    the price of the book
     * @param title    the title of the book
     * @param year     the year the book was released.
     * @param pages    the number of pages in the book
     * @param num_ISBN the ISBN number of the book
     */
    public Book(String title, int year, double price, int pages, int num_ISBN) {
        super(title, year, price);
        this.pages = pages;
        this.num_ISBN = num_ISBN;
    }

    /**
     * The print function which is inherited from the Media class is responsible for printing all
     * the Attributes of a book.
     */
    public void print() {
        System.out.println("Book - Title: " + getTitle() +
                ", Year: " + getYear() +
                ", Price: " + getPrice() +
                ", Pages: " + pages +
                ", ISBN: " + num_ISBN);
    }

    public int getNum_ISBN() {
        return num_ISBN;
    }

    public void setNum_ISBN(int num_ISBN) {
        this.num_ISBN = num_ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return super.toString() +
                "pages=" + pages +
                ", num_ISBN=" + num_ISBN +
                ' ';
    }
}
