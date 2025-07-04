package LambdaExpressions.AnimalsExample;

public class Bug extends Animal {
    public Bug(String name, int age) {
        super(name, age);
    }

    Go go = (name) -> name + " digging";
}
