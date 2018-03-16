public abstract class Pizza {
    String pizzaName;

    public void bake(){
        System.out.println("Baking " + pizzaName);
    }

    public void cut(){
        System.out.println("Cutting pizza");
    }

    public void ready(){
        System.out.println("\n"+pizzaName + " is ready!");
    }

    public abstract void prepare();
}