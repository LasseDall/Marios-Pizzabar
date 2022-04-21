package com.company;

import java.util.Scanner;

public class Pizzeria {
    private MenuKort menuKort;
    private BestillingsListe bestillingsListe;

    public Pizzeria(){
        menuKort = new MenuKort();
        bestillingsListe=new BestillingsListe();

    }

    public void controller() {
        Pizza pizza1 = new Pizza(1, "Margeritha", "tomat,ost", 65);
        Pizza pizza2 = new Pizza(2, "Pepperoni", "tomat,ost,pepperoni", 70);
        menuKort.tilføj(pizza1);
        menuKort.tilføj(pizza2);
        lavBestilling(1,0015);
        //menuKort.visMenu();
    }

    public void lavBestilling(int antalPizzaer,int afhentning){
        Scanner keyboard = new Scanner(System.in);
        Bestilling bestilling = new Bestilling(afhentning);
        while (antalPizzaer>0){
            System.out.println("pizza nummer");
            String pizzaNummer = keyboard.nextLine();
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
