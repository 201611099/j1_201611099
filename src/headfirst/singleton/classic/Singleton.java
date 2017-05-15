package headfirst.singleton.classic;

public class Singleton {
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  
  private Singleton() {
    
  }
  public static Singleton getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new Singleton();
      /*자기자신은 private 쓸 수 있음. / lazy initialization*/
    }
    //else {
    System.out.println("returning...");
    System.out.println("num called... " + numCalled++);
      return uniqueInstance;
    //}
  }
}