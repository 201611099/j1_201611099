package headfirst.factory.pizzaaf.small;

public class PotatoPizza extends Pizza{  
  PizzaIngredientFactory inFac;
  public PotatoPizza(PizzaIngredientFactory ingredientFac) {
    name = "Abstract Factory Potato Pizza";
    this.inFac = ingredientFac;
  }
  public void prepare(){
    System.out.println("Preparing...");
    dough = inFac.createDough();
    cheese = inFac.createCheese();
    potato = inFac.createPotato();
  }
}