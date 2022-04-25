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
        return "\n" + bestilling +" Samlet pris: "+ udregnPris() +"kr\nAfhentningstidspunkt kl. "+afhentning+ " Ordernummer "+ordreNummer + '\n';
    }

    public int udregnPris() {
        int samletPris = 0;
        for(int i = 0; i < bestilling.size(); i++) {
            samletPris += bestilling.get(i).getPris();
        }
        return samletPris;
    }

    public int getAfhentning() {
        return afhentning;
    }

    public int getOrdreNummer() {
        return ordreNummer;
    }

    public ArrayList<Pizza> getBestilling() {
        return bestilling;
    }
}
