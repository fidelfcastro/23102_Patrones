public class FanMedium implements Command{
    Fan fan;

    public FanMedium(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.medium();
    }

    @Override
    public void undo() {
        System.out.print("Undo button: ");
        fan.low();
    }
}
