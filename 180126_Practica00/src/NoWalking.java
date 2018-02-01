/**
 * Created by fidel on 1/26/2018.
 */
public class NoWalking implements Walkable {
    @Override
    public void getWalk(){
        System.out.println("Lazy walk");
    }
}
