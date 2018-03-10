import java.util.Observable;
import java.util.Observer;

public class TypeA implements Observer, Display {
    double temperature;

    @Override
    public void update(Observable observable, Object object) {
        WeatherData weatherData = (WeatherData) observable;
        this.temperature = weatherData.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("In type A the temperature is "+ temperature);
    }
}
