package StreamAPI.Day3.HomeWork.Other.Other4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Other4 {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        List<User> users = List.of(new User("Artem", 15, "Manager"), new  User("Bob", 25, "Programmer"), new User("Dima", 40, "TeamLead"), new User("Bob", 25, "Programmer"));
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Optional<Integer>> optionals = List.of(Optional.of(10), Optional.empty(), Optional.of(20), Optional.of(30), Optional.empty());
        List<Client> clients = List.of(new Client("Anton", List.of("Apple", "Banana", "Avocado")), new Client("Bob", List.of("Cherry", "Apricot")), new Client("Jerry", List.of("Cheese", "Apple")));
        System.out.println(
                //Задача 1
                words.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).toList() + "\n" +
                //Задача 2
                users.stream().filter(s -> s.getAge() > 18).distinct().sorted(Comparator.comparing(User::getName)).toList() + "\n" +
                users.stream().map(User::getRole).toList() + "\n" +
                //Задача 3
                numbers.stream().reduce(0, Integer::sum) + "\n" +
                numbers.stream().reduce(1, (a, b) -> a * b) + "\n" +
                //Задача 4
                optionals.stream().flatMap(Optional::stream).map(s -> s * 2).toList() + "\n" +
                //Задача 5
                clients.stream().flatMap(client -> client.getOrders().stream()).distinct().collect(Collectors.joining(" ")) + "\n" +
                clients.stream().flatMap(client -> client.getOrders().stream()).distinct().count()
        );
    }

    static class User{
        private String name;
        private int age;
        private String role;
        private List<String> roles = List.of("Programmer", "Manager", "TeamLead");

        public User(String name, int age,  String role) {
            this.name = name;
            this.age = age;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }
    }

    static class Client{
        private String name;
        private List<String> orders;

        public Client(String name, List<String> orders) {
            this.name = name;
            this.orders = orders;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getOrders() {
            return orders;
        }

        public void setOrders(List<String> orders) {
            this.orders = orders;
        }
    }
}
