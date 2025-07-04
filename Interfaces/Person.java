package Interfaces;

public class Person implements Example{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void SayHello() {
        System.out.println("Person say hello");
    }
}
