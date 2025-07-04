package InheritanceAndOverriding;

public class Main {
    public static void main(String[] args) {
        Man Dmitry = new Man("Dmitry", 29);
        Child Dima = new Child("Dima", 5, "Bear");
        Dmitry.Hello();
        Dima.Hello();
    }
}
