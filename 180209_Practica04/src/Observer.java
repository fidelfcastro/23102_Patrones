import java.util.Observable;

public interface Observer {
    void update(Observable observable, Object object);
}
