package com.company;

import java.util.ArrayList;

public class TestRunner {

    public void Run(){
        testInstrumentsCart();
        testMusician();
        testBand();
        testOrchestra();



    }

    private void testOrchestra() {
        Orchestra oc = new Orchestra();


        String message = String.format("This Orchestra has %d musician(s)", oc.getTotalMusician());
        System.out.println(message);

    }

    private void testBand() {
        Band b = new Band("Rock");
        System.out.println(b.toString());

    }

    private void testMusician() {
        Musician m1 = new Musician("Piano");
        m1.setMusicianCount(1);
        System.out.println(m1.toString());

    }


    private void testInstrumentsCart() {
        InstrumentsCart cart = new InstrumentsCart();
        Instruments i1 = new Instruments("Piano");
        i1.getName();
        cart.addInstruments(i1);

        Instruments i2 = new Instruments("Drums");
        i2.getName();
        cart.addInstruments(i2);

        System.out.println(cart.ShowInstruments());


    }


}
