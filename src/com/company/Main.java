package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Velkommen til Marios Pizzarbar!");
        MenuKort menuKort = new MenuKort();
        Pizza pizza = menuKort.findPizza(2);
        System.out.println(pizza);

       // Pizzeria pizzeria = new Pizzeria();
        //pizzeria.controller();

    }
}
