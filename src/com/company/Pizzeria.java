package com.company;

import java.util.Scanner;

public class Pizzeria {
    private MenuKort menuKort;
    private BestillingsListe bestillingsListe;
    UI ui = new UI();
    boolean programKører = true;
    Scanner sc = new Scanner(System.in);


    public Pizzeria() {
        bestillingsListe = new BestillingsListe();

    }

    public void kørProgram() {
        ui.velkommen();
        while (programKører) {
            ui.mainMenu();
            int valg = sc.nextInt();
            valgMainMenu(valg);
        }
    }

        public void controller() {
            lavBestilling(1, 0015);
            //menuKort.visMenu();
        }

        public void lavBestilling(int antalPizzaer, int afhentning) {
            Scanner keyboard = new Scanner(System.in);
            Bestilling bestilling = new Bestilling(afhentning);
            while (antalPizzaer > 0) {
                System.out.println("pizza nummer");
                int pizzaNummer = keyboard.nextInt();
                Pizza tmp = menuKort.findPizza(pizzaNummer);
                bestilling.tilføj(tmp);
                antalPizzaer--;
            }
            System.out.println(bestilling);
            bestillingsListe.tilføj(bestilling);
        }

        public void oversigt() {
            System.out.println(bestillingsListe.toString());
        }

    public void valgMainMenu(int valg) {
        switch (valg) {
            case 1 -> ui.visMenukort();
            case 2 -> controller();
            case 3 -> oversigt();
            //case 4 -> fjernBestilling();
            case 5 -> programKører = false;
        }
    }
    }

