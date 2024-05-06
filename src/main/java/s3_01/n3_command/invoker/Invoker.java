package s3_01.n3_command.invoker;

import s3_01.n3_command.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private final List<Command> COMMANDS = new ArrayList<>();

    public void start(Command command) {
        COMMANDS.add(command);
    }

    public void brake(Command command) {
        COMMANDS.add(command);
    }

    public void accelerate(Command command) {
        COMMANDS.add(command);
    }

    public void executeCommands() {
        this.COMMANDS.forEach(Command::execute);

        this.COMMANDS.clear();
    }
}
