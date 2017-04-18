package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
      //return new ChicagoStyleCheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new ChicagoStyleVeggiePizza();
      //return new ChicagoStyleVeggiePizza();
    } else if (type.equals("clam")) {
      pizza = new ChicagoStyleClamPizza();
      //return new ChicagoStyleClamPizza();
    } else if (type.equals("pepperoni")) {
      pizza = new ChicagoStylePepperoniPizza();
      //return new ChicagoStylePepperoniPizza();
    } 
    //else return null;
    return pizza;
  }
}