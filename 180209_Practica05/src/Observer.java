import java.util.Observable;

public interface Observer {
    void update(Observable obj, Object arg);
}
