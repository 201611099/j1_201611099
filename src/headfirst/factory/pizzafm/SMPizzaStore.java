package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    if(type.equals("potato")) {
      pizza = new SMStylePotatoPizza();
    } else if(type.equals("cheese")) {
      pizza = new SMStyleCheesePizza();
    }
    return pizza;
  }
}