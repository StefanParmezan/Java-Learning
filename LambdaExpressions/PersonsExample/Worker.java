package LambdaExpressions.PersonsExample;

public class Worker extends Person{
    String work;
    public Worker(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }
    IPersonActions PersonActions = (Disability) -> {
        if (Disability == 0) {
            return "Run forest run";
        }
        return "Sorry, give me wheelchair";
    };
}
