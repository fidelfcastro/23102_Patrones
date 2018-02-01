/**
 * Created by fidel on 1/26/2018.
 */
public class Main {
    public static void main(String [ ] args)
    {
        System.out.println("Patrones practica 00");
        Student student = new Student(new RegularWalk());
        Teacher teacher = new Teacher(new HandWalking());
        Trucker trucker = new Trucker(new NoWalking());
    }
}
