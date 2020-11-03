package com.company;

import javax.swing.text.Style;

public class Musician {
    private String playInstrumentName;
    private int musicianCount = 0;

    public Musician(String _playInstrumentName) {
        playInstrumentName = _playInstrumentName;

    }

    public String getPlayInstrumentName(){
        return playInstrumentName;
    }

    public void setPlayInstrumentName(String _playInstrumentName){
        playInstrumentName = _playInstrumentName;
    }

    public void setMusicianCount(int _count){
        musicianCount = _count;
    }

    public int getMusicianCount(){
        return musicianCount;
    }

    @Override
    public String toString() {
        return String.format("This musician plays: %s", getPlayInstrumentName());
    }
}
