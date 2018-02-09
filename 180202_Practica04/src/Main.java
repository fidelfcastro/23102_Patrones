/**
 * Created by fidel on 2/7/2018.
 */
public class Main {
    public static void main(String [] args){
        System.out.println("Practica 03\n");
        WeatherData weatherData = new WeatherData();
        TypeA a = new TypeA();
        TypeB b = new TypeB();
        TypeC c = new TypeC();

        weatherData.add(a);
        weatherData.add(b);
        weatherData.add(c);

        weatherData.measurementsChanged(70.0, 60.0, 70.0);
    }
}
