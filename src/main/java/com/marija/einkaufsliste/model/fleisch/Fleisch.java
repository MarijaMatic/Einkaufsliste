package com.marija.einkaufsliste.model.fleisch;


import com.marija.einkaufsliste.model.Essen;
import com.marija.einkaufsliste.util.Farbe;

public class Fleisch extends Essen {
    public Fleisch(int kalorien, Farbe farbe) {
     super(kalorien, farbe, true);
    }
}
