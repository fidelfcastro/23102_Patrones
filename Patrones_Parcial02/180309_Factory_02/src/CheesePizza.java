public class CheesePizza extends Pizza {
    Toppings bbq = new Bbq();
    Toppings veggies = new Veggies();

    public CheesePizza(){
        pizzaName = "Cheese Pizza";
    }

    @Override
    public void prepare(){
        System.out.print("Preparing pizza " );
        bbq.addToppings();
        veggies.addToppings();
    }
}