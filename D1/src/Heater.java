public class Heater {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    //task c
    public Heater() {

    }

    //task b
    public Heater(int temperature, int min, int max) {
        this.temperature = temperature;
        this.min = min;
        this.max = max;
    }

    //task a
    public Heater(int temperature, int increment) {
        this.temperature = temperature;
        this.increment = increment;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
