import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MacroCommand implements Command{
    List<Command> commandList;

    public MacroCommand(List<Command> commandList){
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        for(Command command : commandList){
            command.execute();
        }
    }

    @Override
    public void undo() {
        List<Command> inverseCommands = commandList;
        Collections.reverse(inverseCommands);
        for(Command undo : inverseCommands){
            System.out.print("Undo button: ");
            undo.execute();
        }
    }
}
