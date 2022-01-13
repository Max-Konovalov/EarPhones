package ru.mkonovalov;

import java.util.HashMap;
import java.util.Map;

public class Case {

    private float battery;
    private int batteryСapacity;
    private Map<String, Integer> inCase = new HashMap<String, Integer>(){{
        put("RIGHT", 0);
        put("LEFT", 0);
    }};

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

    public Map<String, Integer> getInCase() {
        return inCase;
    }

    public void setInCase(Map<String, Integer> inCase) {
        this.inCase = inCase;
    }
}
