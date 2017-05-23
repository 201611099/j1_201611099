package headfirst.iterator.dinermerger.after;

import headfirst.iterator.dinermerger.before.MenuItem;

public class MyMenuIterator implements Iterator {
  MenuItem[] items;  //Array
  int position = 0;
  public MyMenuIterator(MenuItem[] items) {
    this.items=items;
  }
  public boolean hasNext() {
    if(position>=items.length || items[position] == null) {
      return false;
    }
    else {
      return true;
    }
  }
  public Object next() {
    MenuItem m = items[position];
    position++;
    return m;
  }
}