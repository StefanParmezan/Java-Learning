package LambdaExpressions.AnimalsExample;

import java.util.LinkedList;

public abstract class Animal {
    String name;
    int age;
    static LinkedList<Object> Animals = new LinkedList<>();


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void Save(Object object){
        Animals.add(object);
    }
    public static void Display(){
        System.out.println(Animals);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
