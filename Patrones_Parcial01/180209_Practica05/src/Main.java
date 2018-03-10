public class Main {
    public static void main(String [] args){
        System.out.println("Practica 05\n");

        ClientA clientA = new ClientA();
        ClientB clientB = new ClientB();
        ClientC clientC = new ClientC();

        DhlData dhlData = new DhlData();
        FedexData fedexData = new FedexData();
        EmailsMxData emailsMxData = new EmailsMxData();

        dhlData.addObserver(clientA);
        dhlData.addObserver(clientB);
        dhlData.addObserver(clientC);
        fedexData.addObserver(clientA);
        fedexData.addObserver(clientB);
        emailsMxData.addObserver(clientA);

        dhlData.providerChanged(10.057, 89.65);
        fedexData.providerChanged(15.0,18.65);
        emailsMxData.providerChanged(11.50,12.60);


    }
}
