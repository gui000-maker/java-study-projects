package SensorsAndTemperature;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    List<Sensor> Sensors = new ArrayList<>();

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.Sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.Sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.Sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        for (Sensor sensor : this.Sensors) {
            if (!sensor.isOn()) {
                throw new IllegalStateException("One or more of the sensors is off");
            }
        }

        if (Sensors.isEmpty()) {
            throw new IllegalStateException("No sensors added");
        }

        int sum = 0;
        for (Sensor sensor : this.Sensors) {
            sum += sensor.read();
        }

        return sum / Sensors.size();
    }

    public void addSensor(Sensor sensor) {
        this.Sensors.add(sensor);
    }
}
