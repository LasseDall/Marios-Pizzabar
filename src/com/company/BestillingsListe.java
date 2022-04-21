package com.company;

import java.util.ArrayList;

public class BestillingsListe {
    private ArrayList<Bestilling> bestillinger;

    public BestillingsListe(){
        bestillinger=new ArrayList<>();
    }
    public void tilføj(Bestilling bestilling){
        bestillinger.add(bestilling);
    }
}
