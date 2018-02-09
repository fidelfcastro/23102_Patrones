/**
 * Created by fidel on 2/2/2018.
 */
public class TypeC implements Observer, Display {
    double temperature, pressure, humidity;

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("In type C the temperature is "+ temperature+
                ", the pressure is " + pressure + " and the humidity is " + humidity);
    }
}
