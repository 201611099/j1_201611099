package headfirst.factory.pizzas;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    
    Pizza pizza = store.orderPizza("cheese");
    System.out.println("We ordered a " + pizza.getName() + "\n");
    System.out.println(pizza);
    
    pizza = store.orderPizza("clam");
    System.out.println("We ordered a " + pizza.getName() + "\n");
    System.out.println(pizza);
    
    pizza = store.orderPizza("pepperoni");
    System.out.println("We ordered a " + pizza.getName() + "\n");
    System.out.println(pizza);
    
    pizza = store.orderPizza("potato");
    System.out.println("We ordered a " + pizza.getName() + "\n");
    System.out.println(pizza);
    
    pizza = store.orderPizza("veggie");
    System.out.println("We ordered a " + pizza.getName() + "\n");
    System.out.println(pizza);
  }
}