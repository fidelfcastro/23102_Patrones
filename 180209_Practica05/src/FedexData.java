import java.util.Date;
import java.util.Observable;

public class FedexData extends Observable{
    double qty, value;

    public void providerChanged(double qty, double value){
        this.qty = qty;
        this.value = value;

        setChanged();
        boolean change = hasChanged();
        if(change) {
            try {
                Thread.sleep(15 * 1000);
                notifyObservers();
                clearChanged();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double getQty() {
        return qty;
    }

    public double getValue() {
        return value;
    }
}
