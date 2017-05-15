package headfirst.singleton.threadsafe;

public class Singleton {
  private static Singleton uniqueInstance;
  //private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0;
  
  private Singleton() {
  }
  public static synchronized Singleton getInstance() {
    /*synchronized : 사용중
      다른 cpu에 동기화 시켜서 내가 쓰고있는 것을 알려줌
      화장실 사용중이라고 뜨는 것처럼*/
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new Singleton();
    }
    //else {
    System.out.println("returning...");
    System.out.println("num called... " + numCalled++);
      return uniqueInstance;
    //}
  }
}