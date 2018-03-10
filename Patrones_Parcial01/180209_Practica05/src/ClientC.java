import java.util.Observable;
import java.util.Observer;

public class ClientC implements Observer{
    @Override
    public void update(Observable obj, Object arg) {
        if(obj instanceof DhlData){
            DhlData dhlData = (DhlData) obj;
            double weight = dhlData.getWeight();
            double height = dhlData.getHeight();
            System.out.println("Client C - DHL Data\n Weight " + weight + " Height " + height);
        }
        else if(obj instanceof EmailsMxData){
            EmailsMxData emailsMxData = (EmailsMxData) obj;
            double cost = emailsMxData.getCost();
            double time = emailsMxData.getTime();
            System.out.println("Client C - EmailMX Data\n Cost  " + cost + " Time " + time);
        }
        else{
            FedexData fedexData = (FedexData) obj;
            double qty = fedexData.getQty();
            double value = fedexData.getValue();
            System.out.println("Client C - FEDEX Data\n Quantity " + qty + " Value" + value);
        }
    }
}
