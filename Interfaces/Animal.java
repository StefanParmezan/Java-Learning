package Interfaces;

public class Animal implements Example{
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void SayHello(){
        System.out.println("Animal say hello");
    }
    @Override
    public void Display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
