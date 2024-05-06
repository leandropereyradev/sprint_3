package s3_01.n3_command.invoker;

import s3_01.n3_command.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
        commands.clear();
    }
}
