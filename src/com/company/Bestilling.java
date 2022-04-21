package com.company;

import java.util.ArrayList;

public class Bestilling {
    private ArrayList<Pizza> bestilling;
    private int afhentning;
    private double pris;

    public Bestilling(int afhentning){
        bestilling=new ArrayList<>();
        this.afhentning=afhentning;
    }
    public void tilføj(Pizza pizza){
        bestilling.add(pizza);
    }
}
