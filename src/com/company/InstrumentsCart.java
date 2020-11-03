package com.company;

import java.util.ArrayList;

public class InstrumentsCart {
    private ArrayList<Instruments> listOfInstruments = new ArrayList<Instruments>();

    public  InstrumentsCart(){

    }
    public void addInstruments(Instruments i){
        listOfInstruments.add(i);
    }

    public String ShowInstruments(){
        StringBuilder instruments = new StringBuilder();

        for (Instruments currentInstruments: listOfInstruments){
            instruments.append(String.format("The instrument is %s\n", currentInstruments.getName()));
        }
        return instruments.toString();
    }
}
