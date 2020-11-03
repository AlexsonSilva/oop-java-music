package com.company;

public class Band {
    private String style;

    public Band(String _style){
        style = _style;

    }

    public String getStyle(){
        return style;
    }

    public void setStyle(String _style){
        style = _style;
    }

    @Override
    public String toString() {
        return String.format("This band style is : %s", getStyle());
    }
}
