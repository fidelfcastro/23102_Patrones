import java.util.*;

public class Invoker {
    Map<Integer, List<Command>> slotsMap = new HashMap<>();
    List<Command> commandList = new ArrayList<>();
    Stack<Command> stack = new Stack<>();

    public void setCommand(Command command, int index){
        commandList.add(command);
        slotsMap.put(index,commandList);
    }

    public void pressButton(int index, Command command){
        List<Command> commands;
        commands = slotsMap.get(index);
        for(Command slot : commands){
            if(slot == command){
                slot.execute();
                stack.add(slot);
            }
        }
    }

    public void undoButton(){
        Command undoButton = stack.pop();
        undoButton.undo();
    }
}
