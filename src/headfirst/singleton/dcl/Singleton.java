package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance;
  //private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  
  private Singleton() {
  }
  public static Singleton getInstance() {
    if(uniqueInstance == null) {
      //↓Singleton.class에 대해 동기화 시켜놓음
      synchronized(Singleton.class) {
        if(uniqueInstance == null){
          System.out.println("creating...");
          uniqueInstance = new Singleton();
        }
      }
    }
    //else {
    System.out.println("returning...");
    System.out.println("num called... " + numCalled++);
      return uniqueInstance;
    //}
  }
}