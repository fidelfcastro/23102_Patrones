public class PizzaStore {
    PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.prepare();
        pizza.ready();

        return pizza;
    }
}