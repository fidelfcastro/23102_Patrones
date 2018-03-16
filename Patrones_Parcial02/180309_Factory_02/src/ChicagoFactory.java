public class ChicagoFactory extends PizzaFactory {

    public ChicagoFactory(){
        System.out.println("\n\nThe Chicago Factory\n");
    }
    @Override
    public Pizza createPizza(String type) {
        if(type == "Italian"){
            return new ItalianPizza();
        }
        else if(type == "Cheese"){
            return new CheesePizza();
        }
        else if(type == "Hawaian"){
            return new HawaianPizza();
        }
        else{
            return null;
        }
    }
}