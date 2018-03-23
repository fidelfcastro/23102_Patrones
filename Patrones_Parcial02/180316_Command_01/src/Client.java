public class Client {
    public static void main(String [] args){
        Invoker invoker = new Invoker();

        WasherMachine washerMachine = new WasherMachine();
        WasherMachineOn washerMachineOn = new WasherMachineOn(washerMachine);
        WasherMachineOff washerMachineOff = new WasherMachineOff(washerMachine);

        Fan fan = new Fan();
        FanHigh fanHigh = new FanHigh(fan);
        FanMedium fanMedium = new FanMedium(fan);
        FanLow fanLow = new FanLow(fan);
        FanOff fanOff = new FanOff(fan);

        invoker.setCommand(washerMachineOn, 1);
        invoker.setCommand(washerMachineOff, 2);
        invoker.setCommand(fanHigh,3);
        invoker.setCommand(fanMedium,4);
        invoker.setCommand(fanLow,5);
        invoker.setCommand(fanOff,6);

        invoker.pressButton(1);
        invoker.undoButton();
    }
}
