package com.company;

import java.util.ArrayList;

public class MenuKort {
    private ArrayList<Pizza> menuKort;
    Pizza pizza1 = new Pizza(1, "Margeritha", "tomat,ost", 65);
    Pizza pizza2 = new Pizza(2, "Pepperoni", "tomat,ost,pepperoni", 70);

public MenuKort(){
    menuKort=new ArrayList<>();
    tilføj(pizza1);
    tilføj(pizza2);
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
public void tilføj(Pizza pizza){
    menuKort.add(pizza);
}
}
