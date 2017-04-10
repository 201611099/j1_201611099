package headfirst.decorator.starbuzz;

public class DarkRoast extends Beverage {
  //description = "Dark Roast Coffee";
  public DarkRoast(){
    description = "Dark Roast Coffee";
  }
  /*public String getDescription() {
    return description;
  } */
  //public abstract double cost()
  public double cost() {
    return 0.99;
  }
}