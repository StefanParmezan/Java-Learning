package Multithreading.Methods.Interrupt;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class DataLoader implements Runnable {
    private static Map<String, Integer> DataBase = new ConcurrentHashMap<String, Integer>();
    static Scanner sc = new Scanner(System.in);
    String name;
    Integer age;

    public DataLoader(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("DataLoader started");
        for(int i = 0; i < 10 && !Thread.currentThread().isInterrupted(); i++) {
            System.out.println(i * 10 + "%");
            try {
                Thread.sleep(name.length() * 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("100%");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DataBase.put(name, age);
        System.out.println("\u001B[32mDataLoader finished successful\u001B[0m");
        System.out.println("Database after loading " + DataBase);
    }

    public static void sendData(String name, Integer age){
        Thread sender = new Thread(new DataLoader(name, age));
        sender.start();
        System.out.println("Press enter to stop loading");
        String exit = sc.nextLine();
        if(exit.isEmpty()){
            sender.interrupt();
        }
    }
}
