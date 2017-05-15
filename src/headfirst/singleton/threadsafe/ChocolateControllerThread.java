package headfirst.singleton.threadsafe;

public class ChocolateControllerThread {
  public static void main(String args[]) {
    ChocolateBoilerThread boiler = ChocolateBoilerThread.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
    
    ChocolateBoilerThread boiler2 = ChocolateBoilerThread.getInstance();
    ChocolateBoilerThread boiler3 = ChocolateBoilerThread.getInstance();
    ChocolateBoilerThread boiler4 = ChocolateBoilerThread.getInstance();
  }
}