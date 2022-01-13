package ru.mkonovalov;

import java.util.HashMap;
import java.util.Map;

public class Case {
    private float battery;
    private int batteryСapacity;
    private Map <String, Integer> inCase = new HashMap<String, Integer>(){{
        put("RIGHT", 0);
        put("LEFT", 0);
    }};

    Earphone rightEar = new Earphone(EarPhoneSide.RIGHT);
    Earphone leftEar = new Earphone(EarPhoneSide.LEFT);

    void showStats(){

    }

    String checkInCase(){
        return ("Правый наушник: " +
                inCase.get("RIGHT").toString() +
                "\nЛевый наушник: " +
                inCase.get("LEFT").toString());

    }

    void chargeEars(){}

    void putInCase(Earphone earSide){
        inCase.replace(earSide.getSide().toString(), 1);
    }


}
