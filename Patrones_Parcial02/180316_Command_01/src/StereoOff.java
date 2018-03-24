public class StereoOff implements Command {
    Stereo stereo;

    public StereoOff(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
