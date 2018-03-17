public class WasherMachineOn implements Command {
    WasherMachine washerMachine;

    public WasherMachineOn(WasherMachine washerMachine){
        this.washerMachine = washerMachine;
    }
    @Override
    public void execute() {
        washerMachine.on();
    }

    @Override
    public void undo() {

    }
}
