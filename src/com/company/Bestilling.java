package com.company;

import java.util.ArrayList;

public class Bestilling {
    private ArrayList<Pizza> bestilling;

    public Bestilling(){
        bestilling=new ArrayList<>();
    }
    public void tilføj(Pizza pizza){
        bestilling.add(pizza);
    }
}
