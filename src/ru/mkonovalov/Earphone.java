package ru.mkonovalov;

public class Earphone {
    private float battery;
    private int batteryСapacity;
    private EarPhoneSide side;

    public Earphone(EarPhoneSide side) {
        this.side = side;
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public int getBatteryСapacity() {
        return batteryСapacity;
    }

    public void setBatteryСapacity(int batteryСapacity) {
        this.batteryСapacity = batteryСapacity;
    }

    public EarPhoneSide getSide() {
        return side;
    }

    public void setSide(EarPhoneSide side) {
        this.side = side;
    }
}
