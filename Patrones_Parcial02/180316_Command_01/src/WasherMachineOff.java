public class WasherMachineOff implements Command {
    WasherMachine washerMachine;

    public WasherMachineOff(WasherMachine washerMachine){
        this.washerMachine = washerMachine;
    }
    @Override
    public void execute() {
        washerMachine.off();
    }

    @Override
    public void undo() {
        System.out.print("Undo button: ");
        washerMachine.on();
    }
}
