public class FanLow implements Command {
    Fan fan;
    public FanLow(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.low();
    }

    @Override
    public void undo() {

    }
}
