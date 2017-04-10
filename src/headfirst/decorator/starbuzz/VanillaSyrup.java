package headfirst.decorator.starbuzz;

public class VanillaSyrup extends CondimentDecorator {
 Beverage beverage;

 public VanillaSyrup(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + "Decorating Vanilla Syrup";
 }

 public double cost() {
  return beverage.cost()+0.1;
 }
}