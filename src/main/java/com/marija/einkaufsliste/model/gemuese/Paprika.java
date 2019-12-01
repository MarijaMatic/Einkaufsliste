package com.marija.einkaufsliste.model.gemuese;

import com.marija.einkaufsliste.util.Farbe;

public class Paprika extends Gemuese {
    public Paprika(Farbe farbe) {
        super(20, farbe);
    }

    @Override
    public String toString() {
        return "Paprika " + getFarbe();
    }
}
