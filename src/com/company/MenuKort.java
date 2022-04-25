package com.company;

import java.util.ArrayList;

public class MenuKort {
    private ArrayList<Pizza> menuKort;
    Pizza pizza1 = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke og oregano", 57);
    Pizza pizza2 = new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
    Pizza pizza3 = new Pizza(3, "Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
    Pizza pizza4 = new Pizza(4, "Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63);
    Pizza pizza5 = new Pizza(5, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
    Pizza pizza6 = new Pizza(6, "Bertil", "tomatsauce, ost, bacon og oregano", 57);
    Pizza pizza7 = new Pizza(7, "Silvia", "tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano", 61);
    Pizza pizza8 = new Pizza(8, "Victoria", "tomatsauce, ost skinke, ananas, champignon, løg og oregano", 61);
    Pizza pizza9 = new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
    Pizza pizza10 = new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61);
    Pizza pizza11 = new Pizza(11, "Hawai", "tomatsauce ost, skinke, ananas og oregano", 61);
    Pizza pizza12 = new Pizza(12, "Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61);
    Pizza pizza13 = new Pizza(13, "Venezi", "tomatsauce, ost skinke, bacon og oregano", 61);
    Pizza pizza14 = new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);


    public MenuKort(){
    menuKort=new ArrayList<>();
    menuKort.add(pizza1);
    menuKort.add(pizza2);
    menuKort.add(pizza3);
    menuKort.add(pizza4);
    menuKort.add(pizza5);
    menuKort.add(pizza6);
    menuKort.add(pizza7);
    menuKort.add(pizza8);
    menuKort.add(pizza9);
    menuKort.add(pizza10);
    menuKort.add(pizza11);
    menuKort.add(pizza12);
    menuKort.add(pizza13);
    menuKort.add(pizza14);
}
public void visMenu(){
    System.out.println(menuKort);
}
public Pizza findPizza(int pizzaNummer){
    for (int i = 0; i < menuKort.size(); i++) {
        if (menuKort.get(i).getNummer() == pizzaNummer){
            Pizza tmp = menuKort.get(i);
            return tmp;
        }
    }
    return null;
}
}
