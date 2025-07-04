package CollectionsFramework.Set;

import javax.management.ObjectName;
import java.util.*;

public class User {
    String name;
    String checkedPassword;
    static TreeSet<String> USERS = new TreeSet<>();
    static HashSet<String> Users1 = new HashSet<>(20);
    static LinkedHashSet<String> Users2 = new LinkedHashSet<>(20);

    public User(String name, String checkedPassword) {
        this.name = name;
        this.checkedPassword = checkedPassword;
        USERS.add(name);
        Users1.add(name);
        Users2.add(name);
    }

    public static TreeSet<String> getUsers() {
        return USERS;
    }

    public static boolean addUser(String name) {
        USERS.add(name);
        return true;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getCheckedPassword() {
        return checkedPassword;
    }

    public void setCheckedPassword(String checkedPassword) {
        this.checkedPassword = checkedPassword;
    }
}
