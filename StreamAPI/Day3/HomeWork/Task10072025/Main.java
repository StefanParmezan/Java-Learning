package StreamAPI.Day3.HomeWork.Task10072025;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import StreamAPI.Day3.HomeWork.Task10072025.Models.*;

class Main {
    static void main(String[] args){
        List<User> users = List.of(
                new User("u1", "Алексей", 25, "Москва"),
                new User("u2", "Мария", 30, "СПб"),
                new User("u3", "Иван", 17, "Москва"),
                new User("u4", "Ольга", 22, "Новосибирск")
        );

        List<Product> products = List.of(
                new Product("Книга", 300, "Книги"),
                new Product("Чай", 150, "Еда"),
                new Product("Кофеварка", 5000, "Электроника"),
                new Product("Блокнот", 200, "Канцелярия")
        );

        List<Purchase> purchases = List.of(
                new Purchase("u1", products.get(0), LocalDateTime.of(2023, 1, 10, 12, 0)),
                new Purchase("u1", products.get(1), LocalDateTime.of(2023, 1, 10, 12, 30)),
                new Purchase("u2", products.get(1), LocalDateTime.of(2023, 1, 11, 14, 0)),
                new Purchase("u3", products.get(3), LocalDateTime.of(2023, 1, 12, 10, 0)),
                new Purchase("u4", products.get(2), LocalDateTime.of(2023, 1, 12, 11, 0))
        );

        System.out.println(purchases.size());
        System.out.println(purchases.stream().mapToDouble(product -> product.getProduct().getPrice()).sum());
        System.out.println(purchases.stream().mapToDouble(product -> product.getProduct().getPrice()).max());
        System.out.println(purchases.stream()
                .collect(Collectors.groupingBy(Purchase::getUserId, Collectors.counting())) // группируем и считаем
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()));

    }
}
