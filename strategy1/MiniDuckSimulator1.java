package headfirst.strategy1;

public class MiniDuckSimulator1 {
  public static void main(String[] args) {
    Duck mallard= new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
  }
}