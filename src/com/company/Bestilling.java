package com.company;

import java.util.ArrayList;

public class  Bestilling {
    private ArrayList<Pizza> bestilling = new ArrayList<>();
    private int afhentning;
    private double pris;

    public Bestilling(int afhentning){
        this.afhentning=afhentning;
    }

    public void tilføj(Pizza pizza){
        bestilling.add(pizza);
    }

    @Override
    public String toString() {
        return bestilling +" samlet pris "+pris+"kr\nafhentningstidspunkt: "+afhentning;
    }
}
