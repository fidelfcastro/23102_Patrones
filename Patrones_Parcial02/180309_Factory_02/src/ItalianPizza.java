public class ItalianPizza extends Pizza {
    Toppings bbq = new Bbq();
    Toppings veggies = new Veggies();
    Toppings chilli = new ChilliSauce();

    public ItalianPizza(){
        pizzaName = "Italian Pizza";
    }

    public void prepare(){
        System.out.print("Preparing pizza ");
        bbq.addToppings();
        veggies.addToppings();
        chilli.addToppings();
    }
}