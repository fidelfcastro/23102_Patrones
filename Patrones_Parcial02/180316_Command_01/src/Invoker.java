import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {
    Map<Integer, Command> slots = new HashMap<>();
    Command slot;

    public void setCommand(Command command, int index){
        slots.put(index,command);
    }

    public void pressButton(int index){
        slot = slots.get(index);
        slot.execute();
    }

    public void undoButton(){
        slot.undo();
    }
}
