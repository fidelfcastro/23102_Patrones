public class HawaianPizza extends Pizza {
    Toppings chilli = new ChilliSauce();

    public HawaianPizza(){
        pizzaName = "Hawaian Pizza";
    }

    public void prepare(){
        System.out.print("Preparing pizza ");
        chilli.addToppings();

    }
}