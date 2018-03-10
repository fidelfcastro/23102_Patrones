public class Main {
    public static void main(String [] args){
        Drink drink = new Expresso("Medium");
        System.out.println(drink.getDescription() + " $"+drink.cost());
        drink = new AlmondMilk(drink);
        System.out.println(drink.getDescription() + " $"+drink.cost());
        drink = new SoyMilk(drink);
        System.out.println(drink.getDescription() + " $"+drink.cost());

    }
}
//Decorator Pattern
//Mas funcionalidad = extender
