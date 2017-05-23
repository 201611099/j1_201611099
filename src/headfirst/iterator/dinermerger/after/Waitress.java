package headfirst.iterator.dinermerger.after;

import headfirst.iterator.dinermerger.before.MenuItem;

public class Waitress {
  PancakeHouseMenu pancake;
  DinerMenu diner;
  MyMenu my;
  
  public Waitress(PancakeHouseMenu pancake, DinerMenu diner, MyMenu my) {
    this.pancake = pancake;
    this.diner = diner;
    this.my = my;
  }
  public void printMenu() {
    Iterator pancakeIterator = pancake.createIterator();
    Iterator dinerIterator = diner.createIterator();
    Iterator myIterator = my.createIterator();
    
    System.out.println("MENU\n---\nBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerIterator);
    System.out.println("\nDINNER");
    printMenu(myIterator);
  }
  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.print(menuItem.getName()+", ");
      System.out.print(menuItem.getPrice()+" -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}