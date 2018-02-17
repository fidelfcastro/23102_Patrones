import java.util.Observable;

public class EmailsMxData extends Observable {
    double cost, time;
    boolean change;

    public void providerChanged(double cost, double time) {
        this.cost = cost;
        this.time = time;

        setChanged();
        change = hasChanged();
        if (change) {
            try {
                Thread.sleep(10 * 1000);
                notifyObservers();
                clearChanged();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double getCost(){
        return cost;
    }

    public double getTime() {
        return time;
    }

}
