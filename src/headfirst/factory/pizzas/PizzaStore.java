package headfirst.factory.pizzas;

//import headfirst.factory.pizzas.Pizza;
//같은 package에 있으면 생략가능

public class PizzaStore {
  SimplePizzaFactory factory = null;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type);
    //factory의 특징 잘 보여줌
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}