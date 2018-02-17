import java.util.Date;
import java.util.Observable;

public class DhlData extends Observable{
    double weight, height;

    public void providerChanged(double weight, double height){
        this.weight = weight;
        this.height = height;

        setChanged();
        boolean change = hasChanged();
        if(change){
            try {
                Thread.sleep(5 * 1000);
                notifyObservers();
                clearChanged();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

//DEBILMENTE ACOPLADO (Loosly coopled)
//FAVORECER COMPOSICION SOBRE HERENCIA
//ENCAPSULAR COMPORTAMIENTO
//PROGRAMAR PARA UN SUPER TIPO