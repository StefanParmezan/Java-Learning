package CollectionsFramework.Set;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        UserService.register("Anton", "12345678");
        UserService.register("Misha", "12345678");
        UserService.register("Dima", "12345678");
        UserService.register("Jane", "12345678");
        UserService.register("John", "12345678");
        UserService.register("Jack", "12345678");
        UserService.register("Bob", "12345678");

        System.out.println("HashSet       " + User.Users1);
        System.out.println("LinkedHashSet " + User.Users2);
        System.out.println("TreeSet       " + User.USERS);
    }
}
