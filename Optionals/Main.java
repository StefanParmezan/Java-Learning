package Optionals;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Stefan", null, "12345");
        System.out.println(user1.getEmail().orElse("Email is empty"));
    }
}
