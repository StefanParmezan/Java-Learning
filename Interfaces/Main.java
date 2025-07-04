package Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal Dog = new Animal("Rayan", 5);
        Person Person1 = new Person("Dmitry", 24);

        Dog.Display();
        Person1.Display();
    }
}
