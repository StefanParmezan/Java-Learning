package LambdaExpressions.PersonsExample;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Hello, " + name + ", " + age + "!");
    };


}
