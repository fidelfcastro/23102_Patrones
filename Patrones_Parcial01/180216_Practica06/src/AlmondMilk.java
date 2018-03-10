public class AlmondMilk extends Ingredients {
    Drink drink;
    public AlmondMilk(Drink drink){
        this.drink = drink;
        this.size = drink.size;
    }

    @Override
    public String getDescription() {
        return "Almond Milk "+ drink.getDescription();
    }
    @Override
    public String getSize() {
        return drink.size;
    }

    @Override
    public double cost() {
        if(getSize() == "Small"){
            return 15.00 + drink.cost();
        }
        else if(getSize() == "Medium"){
            return 20.00 + drink.cost();
        }
        else if(getSize() == "Large"){
            return 25.00 + drink.cost();
        }
        else{
            return 15.00 + drink.cost();
        }
    }
}
