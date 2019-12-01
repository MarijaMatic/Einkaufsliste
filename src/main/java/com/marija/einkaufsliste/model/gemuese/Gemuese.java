package com.marija.einkaufsliste.model.gemuese;


import com.marija.einkaufsliste.model.Essen;
import com.marija.einkaufsliste.util.Farbe;

public class Gemuese extends Essen {

    public Gemuese(int kalorien, Farbe farbe){
        super(kalorien, farbe, true);
    }

}
