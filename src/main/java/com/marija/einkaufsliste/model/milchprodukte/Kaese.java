package com.marija.einkaufsliste.model.milchprodukte;


import com.marija.einkaufsliste.util.Farbe;

public class Kaese extends Milchprodukt{
    public Kaese(){
        super(100, Farbe.GELB, false);
    }

    public String toString(){
        return "Kaese";
    }
}
