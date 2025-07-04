package CollectionsFramework.Set;

import static CollectionsFramework.Set.User.USERS;

public class UserService {
    public static void register(String username, String password) throws Exception {
        System.out.println("Hello, " + username + " we checked you username");
        if(USERS.contains(username)) {
            throw new Exception("Sorry username already exists!");
        }
        System.out.println(username + " , we checked you password");
        String CheckPassword = "12345678";
        if(!password.equals(CheckPassword)) {
            throw new Exception("Sorry password does not match!");
        }
        User User1 = new User(username, password);

    }
}
