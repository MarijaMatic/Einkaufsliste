package com.marija.einkaufsliste.model;

import com.marija.einkaufsliste.util.Farbe;

public class Essen {
    private int kalorien;
    private Farbe farbe;
    private boolean istGesund;

    public Essen(int kalorien, Farbe farbe, boolean istGesund){
        this.kalorien = kalorien;
        this.farbe = farbe;
        this.istGesund = istGesund;

    }
    public int getKalorien() {
        return kalorien;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public boolean isIstGesund() {
        return istGesund;
    }

    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    public void setIstGesund(boolean istGesund) {
        this.istGesund = istGesund;
    }

}
