package headfirst.iterator.dinermerger.after;

import headfirst.iterator.dinermerger.before.MenuItem;

public class MyMenu implements Menu {
  MenuItem[] menuItems;
  static final int MAX_ITEMS = 3; //��� ����ġ�� final
  int numberOfItems = 0;
  public MyMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("�������", "��� ��ä�� �ҽ��� ���", true, 3500);
    addItem("��ġ����", "�߰ſ� ������ ��� ��ä�� �ְ�  ����", true, 2500);
    addItem("������", "�߰ſ� ������ �а��� ���װ� ��ä�� �ְ� ����", true, 4000);
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