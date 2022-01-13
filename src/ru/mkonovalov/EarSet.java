package ru.mkonovalov;

public class EarSet {

    Case aCase = new Case();
    Earphone rightEar = new Earphone(EarPhoneSide.RIGHT);
    Earphone leftEar = new Earphone(EarPhoneSide.LEFT);

    void showStats(){

    }

    String checkInCase(){
        return ("Правый наушник: " +
                aCase.getInCase().get("RIGHT").toString() +
                "\nЛевый наушник: " +
                aCase.getInCase().get("LEFT").toString());

    }

    void chargeEars(){}

    void putInCase(Earphone earSide){
        aCase.getInCase().replace(earSide.getSide().toString(), 1);
    }


}
