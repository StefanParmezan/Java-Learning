package Multithreading.Methods.Synchronized;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Database implements Runnable {
    private String name;
    private String work;
    private Actions action;
    private static Map<String, String> Workers = new ConcurrentHashMap<String, String>();

    public Database(String name, String work, Actions action) {
        this.name = name;
        this.work = work;
        this.action = action;
    }
    public Database(String name, Actions action) {
        this.name = name;
        this.action = action;
    }

    @Override
    public void run() {
        switch (action) {
            case ADD:
                Database.addWorker(this.getName(), this.getWork());
                System.out.println("Add" + Workers);
                break;
            case REMOVE:
                Database.removeWorker(this.getName());
                System.out.println("Remove" + Workers);
                break;
            case UPDATE:
                Database.updateWorker(this.getName(), this.getWork());
                System.out.println("Update" + Workers);
                break;
        }

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    private void setWork(String work) {
        this.work = work;
    }

    public static synchronized Map<String, String> getWorkers() {
        return Workers;
    }

    private static void setWorkers(Map<String, String> workers) {
        Workers = workers;
    }

    private static void addWorker(String name, String work) {
        Workers.put(name, work);
    }

    private static void removeWorker(String name) {
        Workers.remove(name);
    }

    private static void updateWorker(String name, String work) {
        Workers.put(name, work);
    }
}
