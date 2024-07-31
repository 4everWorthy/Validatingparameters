package application;

public class StandardSensor implements Sensor {
    private int number;

    public StandardSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // Do nothing
    }

    @Override
    public void setOff() {
        // Do nothing
    }

    @Override
    public int read() {
        return this.number;
    }
}
