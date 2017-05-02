package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory inFac=new ChicagoPizzaIngredientFactory();
    if (type.equals("cheese")) {
      pizza = new CheesePizza(inFac);
    }
    else if (type.equals("potato")) {
      pizza = new PotatoPizza(inFac);
    }
    return pizza;
  }
}