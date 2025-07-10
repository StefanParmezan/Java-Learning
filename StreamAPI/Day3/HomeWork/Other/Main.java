package StreamAPI.Day3.HomeWork.Other;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Main {
    static void main(String[] args) {
        List<User> users = List.of(
                new User("Алексей", 25, "Москва"),
                new User("Мария", 17, "СПб"),
                new User("Иван", 30, "Москва"),
                new User("Ольга", 22, "Новосибирск"),
                new User("Дмитрий", 16, "Москва"),
                new User("Екатерина", 28, "СПб")
        );
        List<User> result = users.stream().filter(s -> s.getCity().equals("Москва")).sorted(Comparator.comparing(User::getName)).toList();

        Map<String, Integer> overmap = new LinkedHashMap<>();

    }
}
