package exercise1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SingletonUndo {
    private static SingletonUndo instance;

    private LinkedList<String> commands = new LinkedList<String>();

    private SingletonUndo() {
    }

    public static synchronized SingletonUndo getInstance() {
        if (instance == null) {
            instance = new SingletonUndo();
        }
        return instance;
    }

    protected void addCommand(String command) {
        commands.addLast(command);
    }

    protected String listCommands() {
        String comandsString = "";
        Iterator<String> iterCommand = commands.iterator();
        while (iterCommand.hasNext()) {
            comandsString += iterCommand.next() + "\n";
        }
        return comandsString;
    }

    protected void deleteLastCommand() {
        try {
            commands.removeLast();
        } catch (NoSuchElementException e) {
            System.out.println("There aren't command to undo");
        }
    }

}
