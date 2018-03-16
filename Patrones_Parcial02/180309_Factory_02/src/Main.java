public class Main {
    public static void main(String[] args){
        System.out.print("Practica Factory 02");
        PizzaStore chicagoStore = new PizzaStore(new ChicagoFactory());
        chicagoStore.orderPizza("Cheese");

        PizzaStore nyStore = new PizzaStore(new NyFactory());
        nyStore.orderPizza("Hawaian");

        PizzaStore tjStore = new PizzaStore(new TjFactory());
        tjStore.orderPizza("Italian");
    }
}