package com.company;

public class TestRunner {

    public void Run(){
        testInstrumentsCart();
        testMusician();
        testBand();



    }

    private void testBand() {
        Band b = new Band("Rock");
        System.out.println(b.toString());

    }

    private void testMusician() {
        Musician m = new Musician("Piano");

        System.out.println(m.toString());
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
