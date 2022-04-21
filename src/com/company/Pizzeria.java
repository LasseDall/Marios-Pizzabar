package com.company;

public class Pizzeria {


    public void controller() {
        MenuKort menuKort = new MenuKort();
        BestillingsListe bestillingsListe=new BestillingsListe();
        Pizza pizza1 = new Pizza(1, "Margeritha", "tomat,ost", 65);
        Pizza pizza2 = new Pizza(2, "Pepperoni", "tomat,ost,pepperoni", 70);
        menuKort.tilføj(pizza1);
        menuKort.tilføj(pizza2);
        menuKort.visMenu();
    }

    //public void lavBestilling()
}
