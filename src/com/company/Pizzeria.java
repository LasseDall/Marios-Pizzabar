package com.company;

import java.util.Scanner;

public class Pizzeria {
    private MenuKort menuKort;
    private BestillingsListe bestillingsListe;

    public Pizzeria(){
        bestillingsListe=new BestillingsListe();

    }

    public void controller() {
        lavBestilling(1,0015);
        //menuKort.visMenu();
    }

    public void lavBestilling(int antalPizzaer,int afhentning){
        Scanner keyboard = new Scanner(System.in);
        Bestilling bestilling = new Bestilling(afhentning);
        while (antalPizzaer>0){
            System.out.println("pizza nummer");
            int pizzaNummer = keyboard.nextInt();
            Pizza tmp = menuKort.findPizza(pizzaNummer);
            bestilling.tilføj(tmp);
            antalPizzaer--;
        }
        System.out.println(bestilling);
        bestillingsListe.tilføj(bestilling);
    }
    public void oversigt(){
        System.out.println(bestillingsListe.toString());
    }
}
