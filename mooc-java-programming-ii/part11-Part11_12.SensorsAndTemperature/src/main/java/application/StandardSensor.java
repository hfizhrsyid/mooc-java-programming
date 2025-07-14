package application;

public class StandardSensor implements Sensor {
    private int number;

    public StandardSensor(int number) {
        this.number = number; 
    }

    public boolean isOn() { return true; }   // returns true if the sensor is on
    
    public void setOn() {}      // sets the sensor on
    public void setOff() {}     // sets the sensor off
    public int read() { return this.number; }
}
