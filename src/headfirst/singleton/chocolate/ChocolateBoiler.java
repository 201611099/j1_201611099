package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty; //encapsulation
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  
  private ChocolateBoiler() {
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new ChocolateBoiler();
      /*자기자신은 private 쓸 수 있음. / lazy initialization*/
    }
    //else {
    System.out.println("returning...");
    System.out.println("num called... " + numCalled++);
      return uniqueInstance;
    //}
  }
  public void fill() {
    if(isEmpty()) {
      System.out.println("filling...");
      empty=false;
      boiled=false;
    }
  }
  public void drain() {
    if(!isEmpty() && isBoiled()) {
      System.out.println("draining...");
      empty=true;
    }
  }
  public void boil() {
    if(!isEmpty() && !isBoiled()) {
      System.out.println("boiling...");
      boiled=true;
    }
  }
  public boolean isEmpty() {
    return empty;
  }
  public boolean isBoiled() {
    return boiled;
  }
}