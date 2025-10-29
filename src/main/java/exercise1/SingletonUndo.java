package exercise1;

public class SingletonUndo {
    private static SingletonUndo instance;

    private SingletonUndo() { }

    public static synchronized  SingletonUndo getInstance() {
        if (instance == null) {
            instance = new SingletonUndo();
        }
        return instance;
    }

}
