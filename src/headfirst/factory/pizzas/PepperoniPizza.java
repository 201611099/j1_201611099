package headfirst.factory.pizzas;

public class PepperoniPizza extends Pizza {
  public PepperoniPizza() {
    name = "Pepperoni Pizza";
    dough = "Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Sliced Pepperoni");
    toppings.add("Sliced Onion");
    toppings.add("Grated parmesan cheese");
  }
}