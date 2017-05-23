package headfirst.iterator.dinermerger.after;

import java.util.ArrayList;
import headfirst.iterator.dinermerger.before.MenuItem;

public class PancakeHouseMenu {
  //MenuItem[] menuItems;
  ArrayList<MenuItem> menuItems;
 // static final int MAX_ITEMS = 3; //상수 못고치게 final
  //int numberOfItems = 0;
  public PancakeHouseMenu() {
    //menuItems = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList<MenuItem>();
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n,d,v,p);
    //menuItems[numberOfItems] = menuItem;
    menuItems.add(menuItem);
    //numberOfItems++;
    //numberOfItems = numberOfItems + 1;
  }
  //public MenuItem[] getMenuItems() {
  public ArrayList getMenuItems() {
    return menuItems;
  }
  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
  public String toString() {
    return "Objectivlle Pancake House Menu";
  }
}