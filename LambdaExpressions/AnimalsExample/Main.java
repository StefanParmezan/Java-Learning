package LambdaExpressions.AnimalsExample;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Bob", 1, true);
        Bug bug = new Bug("Dima", 2);
        Bird bird = new Bird("Misha", 3, true);

        System.out.println(fish.go.Walk(fish.getName()));
        System.out.println(bug.go.Walk(bug.getName()));
        System.out.println(bird.go.Walk(bird.getName()));

        Animal.Save(fish);
        Animal.Save(bug);
        Animal.Save(bird);
        Animal.Display();
    }
}
