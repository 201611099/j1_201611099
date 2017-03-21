package headfirst.strategy1;

public class MallardDuck extends Duck {
  public MallardDuck() {
    fb=new FIyWithWings();
    fb=new FlyRocketPowered();
    qb=new Quack();
  }
  public void display() {
    System.out.println("Mallard...");
  }
}