package com.marija.einkaufsliste.model.milchprodukte;


import com.marija.einkaufsliste.model.Essen;
import com.marija.einkaufsliste.util.Farbe;

public class Milchprodukt extends Essen {
    public Milchprodukt(int kalorien, Farbe farbe, boolean istGesund){
        super(kalorien, farbe, istGesund);
    }
}
