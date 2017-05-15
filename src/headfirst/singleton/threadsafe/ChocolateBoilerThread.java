package headfirst.singleton.threadsafe;

public class ChocolateBoilerThread {
  private boolean empty; //encapsulation
  private boolean boiled;
  private static ChocolateBoilerThread uniqueInstance;
  private static int numCalled = 0;
  
  private ChocolateBoilerThread() {
    empty=true;
    boiled=false;
  }
  public static synchronized ChocolateBoilerThread getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new ChocolateBoilerThread();
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