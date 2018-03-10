/**
 * Created by fidel on 1/26/2018.
 */
public class Student extends Person {
    Walkable WalkingBehaviour;
    public Student(Walkable WalkingBehaviour){
        super(WalkingBehaviour);
        walk();
    }

}
