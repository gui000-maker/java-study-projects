package SensorsAndTemperature;

public class StandardSensor implements Sensor {
    private int num;

    public StandardSensor(int num) {
       this.num = num;
    }

    public boolean isOn() {
        return true;
    }

    public void setOff() {
    }

    @Override
    public void setOn() {
    }

    @Override
    public int read() {
        return num;
    }
}
