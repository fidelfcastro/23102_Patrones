/**
 * Created by fidel on 2/2/2018.
 */
public class TypeA implements Observer, Display {
    double temperature;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("In type A the temperature is "+ temperature);
    }
}
