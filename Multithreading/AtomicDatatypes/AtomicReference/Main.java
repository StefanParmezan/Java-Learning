package Multithreading.AtomicDatatypes.AtomicReference;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("bob", 0);
        UserUpdater updater = new UserUpdater(user1);

        updater.addClicks(5);

        User updatedUser = updater.getCurrentUser();
        System.out.println("Текущее значение кликов: " + updatedUser.clicks()); // 1
    }
}