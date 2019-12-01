package com.marija.einkaufsliste.model.obst;


import com.marija.einkaufsliste.model.Essen;
import com.marija.einkaufsliste.util.Farbe;

public class Obst extends Essen {
    public Obst (int kalorien, Farbe farbe) {
        super(kalorien, farbe, true);
    }
}
