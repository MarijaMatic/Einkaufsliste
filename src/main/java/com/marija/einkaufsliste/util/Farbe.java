package com.marija.einkaufsliste.util;

public enum Farbe {

    ROT("rot"),
    GELB("gelb"),
    BLAU("blau"),
    ROSA("rosa"),
    GRUEN("gruen"),
    BRAUN("braun"),
    WEISS("weiss"),
    SCHWARZ("schwarz"),
    ORANGE("orange");

    private String value;

    Farbe(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }


}
