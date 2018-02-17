public class Cream extends Ingredients {
    Drink drink;
    public Cream(Drink drink){
        this.drink = drink;
        this.size = drink.size;
    }

    @Override
    public String getDescription() {
        return "Cream "+ drink.getDescription();
    }
    @Override
    public String getSize() {
        return drink.size;
    }

    @Override
    public double cost() {
        if(getSize() == "Small"){
            return 10.00 + drink.cost();
        }
        else if(getSize() == "Medium"){
            return 15.00 + drink.cost();
        }
        else if(getSize() == "Large"){
            return 20.00 + drink.cost();
        }
        else{
            return 10.00 + drink.cost();
        }
    }
}
