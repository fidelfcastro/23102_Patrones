import java.util.Observable;
import java.util.Observer;

/**
 * Created by fidel on 2/2/2018.
 */
public class TypeB implements Observer, Display {
    double temperature, pressure;

    @Override
    public void update(Observable observable, Object object) {
        WeatherData weatherData = (WeatherData) observable;
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        display();

    }

    @Override
    public void display() {
        System.out.println("In type B the temperature is "+ temperature+
                " and the pressure is " + pressure);
    }
}
