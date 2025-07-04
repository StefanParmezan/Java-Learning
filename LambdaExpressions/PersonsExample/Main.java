package LambdaExpressions.PersonsExample;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Bob", 25, "Programmer");
        worker1.sayHello();
        Invalide invalide1 = new Invalide("Anton", 30, 3);
        invalide1.sayHello();
        System.out.println(invalide1.PersonActions.run(invalide1.getDisability()));
        System.out.println(worker1.PersonActions.run(0));
    }
}
