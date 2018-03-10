/**
 * Created by fidel on 3/9/2018.
 */
public class ChicagoFactory extends PizzaFactory {

    public ChicagoFactory(){
        System.out.println("The Chicago Factory\n");
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
