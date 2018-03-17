public class Client {
    public static void main(String [] args){
        SimpleInvoker simpleInvoker = new SimpleInvoker();
        WasherMachine washerMachine = new WasherMachine();
        WasherMachineOn washerMachineOn = new WasherMachineOn(washerMachine);
        Fan fan = new Fan();
        FanHigh fanHigh = new FanHigh(fan);

        simpleInvoker.setCommand(washerMachineOn);
        simpleInvoker.pressButton();

        simpleInvoker.setCommand(fanHigh);
        simpleInvoker.pressButton();
    }
}
