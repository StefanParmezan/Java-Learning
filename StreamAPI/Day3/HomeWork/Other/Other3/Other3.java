package StreamAPI.Day3.HomeWork.Other.Other3;

import java.util.*;
import java.util.stream.*;

public class Other3 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Алексей", Arrays.asList("Кофе", "Чай", "Пирожное")),
                new User("Мария", Arrays.asList("Салат", "Суп")),
                new User("Иван", Arrays.asList("Бургер", "Картошка", "Сок", "Десерт")),
                new User("Ольга", Arrays.asList("Суп", "Салат", "Хлеб", "Компот"))
        );

        // 1. Общее количество заказов через reduce()
        int totalOrders = users.stream().reduce(0, (s, i) -> i.getOrders().size(), Integer::sum);

        System.out.println("Общее число заказов: " + totalOrders);

        // 2. Пользователь с наибольшим числом заказов через reduce()
        Optional<User> topUser = users.stream()
                .reduce((u1, u2) -> u1.getOrders().size() > u2.getOrders().size() ? u1 : u2);

        topUser.ifPresent(user -> System.out.println("Топ пользователь: " + user.getName()));

        // 3. Собери все заказы в одну строку через reduce(), не используя joining()
        String allOrders = users.stream()
                .map(User::getOrders)
                .flatMap(List::stream)
                .reduce("", (acc, order) -> acc.isEmpty() ? order : acc + ", " + order, String::concat);

        System.out.println("Все заказы: " + allOrders);


    }
}
class User {
    private String name;
    private List<String> orders;

    public User(String name, List<String> orders) {
        this.name = name;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public List<String> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return name + ": " + orders;
    }
}
