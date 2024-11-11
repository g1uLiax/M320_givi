public class Book extends Media{
    private int pages;
    private int num_ISBN;
    public Book(String title, int year, double price, int pages, int num_ISBN) {
        super(title, year, price);
        this.pages = pages;
        this.num_ISBN = num_ISBN;
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

    @Override
    public String toString() {
        return super.toString() +
                "pages=" + pages +
                ", num_ISBN=" + num_ISBN +
                ' ';
    }
}
