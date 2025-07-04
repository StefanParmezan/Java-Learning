package LambdaExpressions.AnimalsExample;

public class Bird extends Animal {
    boolean CanFly = true;

    public Bird(String name, int age, boolean CanFly) {
        super(name, age);
        this.CanFly = CanFly;
    }


    Go go = (name) -> name + " flying";
}
