package com.company;

import java.util.ArrayList;

public class MenuKort {
    private ArrayList<Pizza> menuKort;

public MenuKort(){
    menuKort=new ArrayList<>();
}
public void visMenu(){
    System.out.println(menuKort);
}
public Pizza findPizza(int nummer){
    for (int i = 0; i < menuKort.size(); i++) {
        if (menuKort.indexOf(i)==nummer){
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
