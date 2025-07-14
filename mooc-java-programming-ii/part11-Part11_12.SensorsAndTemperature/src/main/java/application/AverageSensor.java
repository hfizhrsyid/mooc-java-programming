package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() { 
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOn() { 
        for(Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }   // returns true if the sensor is on
    
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }      // sets the sensor on

    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }     // sets the sensor off

    public int read() { 
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("No sensors is added.");
        }
        this.readings.add(this.sensors.stream().map(s -> s.read()).reduce(0, (prev, curr) -> prev + curr) / this.sensors.size());
        return this.readings.get(this.readings.size() - 1);
    }

    public int length() {
        return this.sensors.size();
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
