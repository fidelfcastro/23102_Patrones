/**
 * Created by fidel on 2/2/2018.
 */
public class TypeB implements Observer, Display {
    double temperature, pressure;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("In type B the temperature is "+ temperature+
                " and the pressure is " + pressure);
    }
}
