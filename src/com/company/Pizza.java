package com.company;

public class Pizza {
    private int nummer;
    private String name;
    private String description;
    private int pris;

    public Pizza(int nummer, String name, String description, int pris){
        this.nummer=nummer;
        this.name=name;
        this.description=description;
        this.pris=pris;
    }

    @Override
    public String toString() {
        return nummer + ": "+ name+", "+pris+"kr."+"\n"+description+"\n";
    }
}
