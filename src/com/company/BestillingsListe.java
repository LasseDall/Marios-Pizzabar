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
    public void print(){
        System.out.println(bestillinger);
    }
    public void fjern(int nummer){
        for (int i = 0; i < bestillinger.size(); i++) {
            if(bestillinger.get(i).getOrdreNummer()==nummer){
                bestillinger.remove(i);
            }else{
                System.out.println("kan ikke finde ordre");
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(bestillinger);
    }
}
