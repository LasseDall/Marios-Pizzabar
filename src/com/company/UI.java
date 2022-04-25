package com.company;

public class UI {

  public void velkommen() {
    System.out.println("Velkommen til Marios Pizzarbar!");
  }

  public void mainMenu() {
    System.out.println("1. Vis menukort");
    System.out.println("2. Opret bestilling");
    System.out.println("3. Vis bestillingsliste");
    System.out.println("4. Fjern bestilling");
    System.out.println("5. Exit");
  }

  public void visMenukort() {
    System.out.printf("%-80s", " 1. Vesuvio: Tomatsauce, ost, skinke og oregano");
    System.out.printf("57,- \n");
    System.out.printf("%-80s", " 2. Amerikaner: Tomatsauce, ost, oksefars og oregano");
    System.out.printf("53,- \n");
    System.out.printf("%-80s", " 3. Cacciatore: Tomatsauce, ost, pepperoni og oregano");
    System.out.printf("57,- \n");
    System.out.printf("%-80s", " 4. Carbona: Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano");
    System.out.printf("63,- \n");
    System.out.printf("%-80s", " 5. Dennis: Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano");
    System.out.printf("65,- \n");
    System.out.printf("%-80s", " 6. Bertil: Tomatsauce, ost, bacon og oregano");
    System.out.printf("57,- \n");
    System.out.printf("%-80s", " 7. Silvia: Tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", " 8. Victoria: Tomatsauce, ost, skinke, ananas, champignon, løg og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", " 9. Toronfo: Tomatsauce, ost, skinke, bacon, kebab, chili og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", "10. Capricciosa: Tomatsauce, ost, skinke, champignon og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", "11. Hawai: Tomatsauce, ost, skinke, ananas og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", "12. Le Blissola: Tomatsauce, ost, skinke, rejer og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", "13. Venezia: Tomatsauce, ost, skinke, bacon og oregano");
    System.out.printf("61,- \n");
    System.out.printf("%-80s", "14. Mafia: Tomatsauce, ost, pepperoni, bacon, løg og oregano");
    System.out.printf("61,- \n \n");
  }

  public void antalPizza() {
    System.out.println("Hvor mange pizzaer indeholder bestillingen?");
  }

  public void afhenting() {
    System.out.println("Hvornår skal bestillingen afhentes?");
  }
  public void fjern(){
    System.out.println("Hvad er odrernummeret på bestillingen der skal fjernes?");
  }


}
