package Exceptions;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.findbyName(null);
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + " <--- Ouch, exception");
        }
        Object[] Array  = new Object[5];
        Array[0] = new Person();
        Array[1] = new Person();
        Array[2] = new Person();
        Array[3] = new Person();
        Array[4] = new Person();
        try {
            for (int i = 0; i < Array.length + 1; i++) {
                System.out.println(Array[i]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + " <--- Ouch, array exception");
        }
    }
}
