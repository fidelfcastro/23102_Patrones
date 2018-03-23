public class FanHigh implements Command{
    Fan fan;

    public FanHigh(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.high();
    }

    @Override
    public void undo() {
        System.out.print("Undo button: ");
        fan.medium();
    }
}
