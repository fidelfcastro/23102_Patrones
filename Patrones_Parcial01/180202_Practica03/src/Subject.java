/**
 * Created by fidel on 2/2/2018.
 */
public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyWeather();
}
