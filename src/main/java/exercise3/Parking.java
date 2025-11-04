package exercise3;

import exercise3.interfaces.CommandInterface;

public class Parking {
    private CommandInterface command;

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void drive() {
        command.execute();
    }

}
