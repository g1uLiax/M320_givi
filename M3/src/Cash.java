public class Cash implements Payment{
    int given;
    int change;

    public Cash(int given, int change) {
        this.given = given;
        this.change = given - amount;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public int getGiven() {
        return given;
    }

    public void setGiven(int given) {
        this.given = given;
    }
}
