/**
 * Created by fidel on 3/9/2018.
 */
public abstract class Pizza {
    String pizzaName;
    public void bake(){
        System.out.println("Baking " + pizzaName);
    }

    public void cut(){
        System.out.println("Cutting pizza");
    }

    public void prepare(){
        System.out.println("Preparing pizza\n " + pizzaName + " is ready!\n");
    }
}
