package headfirst.decorator.starbuzz;

public class CaramelSauce extends CondimentDecorator {
 Beverage beverage;

 public CaramelSauce(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + "Decorating Caramel Sauce";
 }

 public double cost() {
  return beverage.cost()+0.1;
 }
}