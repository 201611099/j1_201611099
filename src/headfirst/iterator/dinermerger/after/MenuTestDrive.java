package headfirst.iterator.dinermerger.after;

import java.util.*;

public class MenuTestDrive {
  public static void main(String args[]) {
    PancakeHouseMenu pancake = new PancakeHouseMenu();
    DinerMenu diner = new DinerMenu();
    MyMenu my = new MyMenu();
    
    Waitress wait = new Waitress(pancake, diner, my);
    
    wait.printMenu();
  }
}