/**
 * Created by fidel on 1/26/2018.
 */
public class Person {
    public Walkable WalkingBehaviour;

    Person(Walkable WalkingBehaviour){
        this.WalkingBehaviour = WalkingBehaviour;
    }
    public void walk(){
        WalkingBehaviour.getWalk();
    }

}
