/**
 * Created by fidel on 3/9/2018.
 */
public class Main {
    public static void main(String[] args){
        PizzaStore chicagoStore = new PizzaStore(new ChicagoFactory());
        chicagoStore.orderPizza("Cheese");

        PizzaStore nyStore = new PizzaStore(new NyFactory());
        nyStore.orderPizza("Hawaian");

        PizzaStore tjStore = new PizzaStore(new TjFactory());
        tjStore.orderPizza("Italian");
    }
}
