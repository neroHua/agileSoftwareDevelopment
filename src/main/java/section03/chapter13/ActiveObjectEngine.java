package section03.chapter13;

import java.util.LinkedList;

public class ActiveObjectEngine {

    LinkedList<Command> itsCommands = new LinkedList<Command>();

    public void addCommand(Command command) {
        itsCommands.add(command);
    }

    public void run() {
        while(!itsCommands.isEmpty()) {
            Command command = itsCommands.getFirst();
            itsCommands.removeFirst();
            command.execute();
        }
    }
}
