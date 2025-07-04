package CollectionsFramework.Compare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User implements Comparable<User> {
    private String name;
    private Integer age;

    private static List<User> users = new LinkedList<>();
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
        users.add(this);
    }
    public static void DisplayUsers(){
        for(User u : users){
            System.out.println(u.getName() + " " + u.getAge());
        }
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        User.users = users;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
