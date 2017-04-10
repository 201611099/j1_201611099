package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage {
  //description = "House Blend Coffee";
  public HouseBlend(){
    description = "House Blend Coffee";
  }
  /*public String getDescription() {
    return description;
  } */
  //public abstract double cost()
  public double cost() {
    return 0.89;
  }
}