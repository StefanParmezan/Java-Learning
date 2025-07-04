package CollectionsFramework.Map;

import java.util.*;

public class User {
    static Map<String, Integer> Users = new HashMap<String, Integer>();
    static Map<String, Integer> Users2 = new LinkedHashMap<>();
    static Map<String, Integer> Users3 = new TreeMap<>();
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void Display(){
        System.out.println(Users);
        System.out.println(Users2);
        System.out.println(Users3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Map<String, Integer> getUsers() {
        return Users;
    }

    public static void setUsers(Map<String, Integer> users) {
        Users = users;
    }
    public static void AddToUsers(User user) {
        Users.put(user.getName(), user.getAge());
    }
}
