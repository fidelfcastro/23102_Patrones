public class FanOff implements Command{
    Fan fan;

    public FanOff(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {

    }
}
