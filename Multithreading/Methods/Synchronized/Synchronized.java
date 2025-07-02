package Multithreading.Methods.Synchronized;

public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        DatabaseConnector.add("Vanya", "Programmer");
        DatabaseConnector.add("Misha", "Programmer");
        DatabaseConnector.add("Dmitriy", "Programmer");
        DatabaseConnector.add("Artem", "Cooker");
        DatabaseConnector.add("George", "Skater");
        DatabaseConnector.add("Davis", "Student");
        Thread.currentThread().join();
    }
}
