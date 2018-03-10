import java.util.ArrayList;
import java.util.List;

/**
 * Created by fidel on 2/2/2018.
 */
public class WeatherData implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    double temperature, humidity, pressure;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyWeather() {
        for(Observer observer : observerList){
            observer.update(temperature,pressure,humidity);
        }
    }

    public void measurementsChanged(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyWeather();
    }

    public double getTemperature(){
        return temperature;
    }

    public double getPressure(){
        return pressure;
    }

    public double getHumidity(){
        return humidity;
    }
}
