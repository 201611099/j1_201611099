package headfirst.factory.pizzafm;

public class SMStylePotatoPizza extends Pizza {
  public SMStylePotatoPizza() {
    name = "SM Style Potato Pizza";
    dough = "Regular Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Sliced Potatoes");
    toppings.add("Bacon");
    toppings.add("Sliced Onion");
    toppings.add("Sliced Black Olives");
    toppings.add("Mozzarella Cheese");
  }
}