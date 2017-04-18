package headfirst.factory.pizzafm;

public class SMStyleCheesePizza extends Pizza {
  public SMStyleCheesePizza() {
    name = "SM Style Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}