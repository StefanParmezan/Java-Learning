package Multithreading.Methods.Synchronized;


public class DatabaseConnector {
    public static void add(String name, String work) throws InterruptedException {
        Thread thread = new Thread(new Database(name, work, Actions.ADD));
        thread.start();
    }

    public static void remove(String name) throws InterruptedException {
        Thread thread = new Thread(new Database(name, Actions.REMOVE));
        thread.start();
    }

    public static void update(String name, String work) throws InterruptedException {
        Thread thread = new Thread(new Database(name, work, Actions.UPDATE));
        thread.start();
    }
}
