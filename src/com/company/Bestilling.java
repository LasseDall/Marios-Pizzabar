package com.company;

import java.util.ArrayList;

public class  Bestilling {
    private ArrayList<Pizza> bestilling = new ArrayList<>();
    private int afhentning;
    private double pris;
    private int ordreNummer;

    public Bestilling(int afhentning,int ordreNummer){
        this.afhentning=afhentning;
        this.ordreNummer=ordreNummer;
    }

    public void tilføj(Pizza pizza){
        bestilling.add(pizza);
    }

    @Override
    public String toString() {
        return bestilling +" Samlet pris "+pris+"kr\nAfhentningstidspunkt kl. "+afhentning+ " Ordernummer "+ordreNummer;
    }

    public int getOrdreNummer() {
        return ordreNummer;
    }
}
