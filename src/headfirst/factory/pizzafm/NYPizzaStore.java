package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")){
      pizza = new NYStyleCheesePizza();
      //return pizza;
    } else if (type.equals("pepperoni")) {
      pizza = new NYStylePepperoniPizza();
      //return pizza;
    } else if (type.equals("clam")) {
      pizza = new NYStyleClamPizza();
      //return pizza;
    } else if (type.equals("veggie")){
      pizza = new NYStyleVeggiePizza();
      //return pizza;
    } 
    return pizza;
    //마지막에 한 번만 쓴다.
  }
}