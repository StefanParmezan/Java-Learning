package CollectionsFramework.Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Dima", 5);
        User user2 = new User("Bob", 8);
        User user3 = new User("John", 15);
        User user4 = new User("Jane", 29);
        User user5 = new User("Jack", 51);
        User.AddToUsers(user1);
        User.AddToUsers(user2);
        User.AddToUsers(user3);
        User.AddToUsers(user4);
        User.AddToUsers(user5);
        System.out.println(User.Users.containsKey("Bro"));
        System.out.println(User.Users.containsValue(2));
        System.out.println(User.Users.get("John"));
        User.Users2.putAll(User.Users);
        User.Users3.putAll(User.Users);
        User.Display();
    }
}
