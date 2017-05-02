package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
    if (type.equals("cheese")){
      //pizza = new NYStyleCheesePizza();  <- factory method¿¡¼­
      pizza = new CheesePizza(inFac);
    } else if (type.equals("potato")) {
      pizza = new PotatoPizza(inFac);
    }
    /*else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(inFac);
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(inFac);
    } else if (type.equals("veggie")){
      pizza = new VeggiePizza(inFac);
    }*/ 
    return pizza;
  }
}