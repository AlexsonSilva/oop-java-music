package com.company;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Musician> listOfMusician = new ArrayList<Musician>();

    public Orchestra(){

    }

    public void addMusician(Musician musicianToAdd){
        listOfMusician.add(musicianToAdd);
    }

    public int getTotalMusician(){
        int count = 0;

        for (Musician currentMusician: listOfMusician){
            count += currentMusician.getTotalMusician;
        }
        return count;
    }


    @Override
    public String toString() {
        return String.format("This Orchestra has %d musicians", listOfMusician.size());
    }
}
