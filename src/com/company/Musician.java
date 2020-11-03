package com.company;

import javax.swing.text.Style;
import java.util.ArrayList;

public class Musician {
    public int getTotalMusician;
    ArrayList<Musician> musicians = new ArrayList<Musician>();

    private String playInstrumentName;
    private int musicianCount = 0;

    public Musician(String _playInstrumentName) {
        playInstrumentName = _playInstrumentName;

    }
    public void addMusician(Musician m){
        musicians.add(m);

    }

    public String getPlayInstrumentName(){
        return playInstrumentName;
    }

    public void setPlayInstrumentName(String _playInstrumentName){
        playInstrumentName = _playInstrumentName;
    }

    public void setMusicianCount(int _musicianCount){
        musicianCount = _musicianCount;
    }

    public int getMusicianCount(){
        return musicianCount;
    }


    @Override
    public String toString() {
        return String.format("This musician plays: %s", getPlayInstrumentName());
    }
}
