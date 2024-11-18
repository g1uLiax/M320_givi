public class Main {
    public static void main(String []args) {
        Heater heater = new Heater(15, 2);
        Heater heaterMinMax = new Heater(15, 0, 30);
        Heater heater1 = new Heater();
        heater1.setTemperature(15);
        heater1.setIncrement(2);
        heater1.setMax(30);
        heater1.setMin(0);
    }
}
