package headfirst.iterator.dinermerger.after;

import headfirst.iterator.dinermerger.before.MenuItem;

public class MyMenu implements Menu {
  MenuItem[] menuItems;
  static final int MAX_ITEMS = 3; //상수 못고치게 final
  int numberOfItems = 0;
  public MyMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("비빔국수", "면과 야채를 소스에 비빔", true, 3500);
    addItem("잔치국수", "뜨거운 육수에 면과 야채를 넣고  끓임", true, 2500);
    addItem("수제비", "뜨거운 육수에 밀가루 반죽과 야채를 넣고 끓임", true, 4000);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n,d,v,p);
    if(numberOfItems >= MAX_ITEMS) {
      System.err.println("Sorry, menu is full! Can't add item to menu");
    }
    else {
      menuItems[numberOfItems] = menuItem;
      //numberOfItems++;
      numberOfItems = numberOfItems + 1;
    }
  }
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}