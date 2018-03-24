import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String [] args){
        Invoker invoker = new Invoker();
        List<Command> commandList = new ArrayList<>();

        WasherMachine washerMachine = new WasherMachine();
        WasherMachineOn washerMachineOn = new WasherMachineOn(washerMachine);
        WasherMachineOff washerMachineOff = new WasherMachineOff(washerMachine);

        Fan fan = new Fan();
        FanHigh fanHigh = new FanHigh(fan);
        FanMedium fanMedium = new FanMedium(fan);
        FanLow fanLow = new FanLow(fan);
        FanOff fanOff = new FanOff(fan);

        Stereo stereo = new Stereo();
        StereoOn stereoOn = new StereoOn(stereo);

        commandList.add(fanHigh);
        commandList.add(washerMachineOn);
        commandList.add(stereoOn);

        MacroCommand macroCommand = new MacroCommand(commandList);

        invoker.setCommand(washerMachineOn, 1);
        invoker.setCommand(washerMachineOff, 2);
        invoker.setCommand(fanHigh,3);
        invoker.setCommand(fanMedium,3);
        invoker.setCommand(fanLow,3);
        invoker.setCommand(fanOff,3);
        invoker.setCommand(macroCommand, 4);

        invoker.pressButton(4, macroCommand);
        invoker.undoButton();
    }
}
