package headfirst.decorator.starbuzz;

public class CaramelMacchiato extends Beverage {
  //description = "Caramel Macchiato Coffee";
  public CaramelMacchiato(){
    description = "Caramel Macchiato Coffee";
  }
  /*public String getDescription() {
    return description;
  } */
  //public abstract double cost()
  public double cost() {
    return 1.79;
  }
}