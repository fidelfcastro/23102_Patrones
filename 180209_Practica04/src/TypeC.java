import java.util.Observable;
import java.util.Observer;

public class TypeC implements Observer, Display {
    double temperature, pressure, humidity;

    @Override
    public void update(Observable observable, Object object) {
        WeatherData weatherData = (WeatherData) observable;
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("In type C the temperature is "+ temperature+
                ", the pressure is " + pressure + " and the humidity is " + humidity);
    }
}
