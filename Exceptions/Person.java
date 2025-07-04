package Exceptions;

public class Person {
    String name;
    int age;

    /* Person(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
    public String findbyName(String name){
        if(Person.this.name.equals(name)){
            return "Found Person with name " + name;
        }
        else{
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
