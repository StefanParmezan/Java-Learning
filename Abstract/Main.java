package Abstract;

public class Main {
    public static void main(String[] args) {
        Dog Pug = new Dog("Kevin", 1, false);
        Cat Cat = new Cat("John", 2, false);
        Bird Crow = new Bird("Bob", 3, true);
        Pug.SayHello();
        Cat.SayHello();
        Crow.SayHello();
    }
}
