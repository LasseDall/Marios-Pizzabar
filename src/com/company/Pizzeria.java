package com.company;

import java.util.Scanner;

public class Pizzeria {
    MenuKort menuKort = new MenuKort();
    private BestillingsListe bestillingsListe;
    private int orderNummer = 0;
    UI ui = new UI();
    boolean programKører = true;
    Scanner sc = new Scanner(System.in);


    public Pizzeria() {
        bestillingsListe = new BestillingsListe();
    }

        public void kørProgram () {
            ui.velkommen();
            while (programKører) {
                ui.mainMenu();
                int valg = sc.nextInt();
                valgMainMenu(valg);
            }
        }

        public void lavBestilling ( int antalPizzaer, int afhentning, int ordreNummer){
            Bestilling bestilling = new Bestilling(afhentning, ordreNummer);
            while (antalPizzaer > 0) {
                System.out.println("pizza nummer");
                int pizzaNummer = sc.nextInt();
                Pizza tmp = menuKort.findPizza(pizzaNummer);
                bestilling.tilføj(tmp);
                antalPizzaer--;
            }
            System.out.println(bestilling);
            bestillingsListe.tilføj(bestilling);
        }

        public void oversigt () {
            System.out.println(bestillingsListe.toString());
        }

        public void valgMainMenu ( int valg){
            switch (valg) {
                case 1 -> ui.visMenukort();
                case 2 -> {
                    ui.antalPizza();
                    int antalPizzaer = sc.nextInt();
                    ui.afhenting();
                    int afhentningstidspunkt = sc.nextInt();
                    orderNummer++;
                    lavBestilling(antalPizzaer, afhentningstidspunkt,orderNummer);
                }
                case 3 -> oversigt();
                case 4 -> fjernBestilling();
                case 5 -> programKører = false;
            }
        }
        public void fjernBestilling(){
            ui.fjern();
            int odrerNummer=sc.nextInt();
            bestillingsListe.fjern(odrerNummer);
        }
    }


