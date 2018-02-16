public class Main {
    public static void main(String [] args){
        System.out.println("Practica 04\n");
        WeatherData weatherData = new WeatherData();
        TypeA a = new TypeA();
        TypeB b = new TypeB();
        TypeC c = new TypeC();

        weatherData.addObserver(a);
        weatherData.addObserver(b);
        weatherData.addObserver(c);

        weatherData.measurementsChanged(95.6,80.0,56.25);

    }
}
