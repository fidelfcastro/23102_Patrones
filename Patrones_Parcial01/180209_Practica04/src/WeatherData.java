import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable{
    private List<Observable> observerList = new ArrayList<>();
    double temperature, humidity, pressure;

    public void measurementsChanged(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        setChanged();
        notifyObservers();
        clearChanged();
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
