public class DVD extends Media{
    private int lengthInMinutes;
    public DVD(String title, int year, double price, int lengthInMinutes) {
        super(title, year, price);
        this.lengthInMinutes = lengthInMinutes;
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
