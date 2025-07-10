package StreamAPI.Day3.HomeWork.Other;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(
                list.stream().filter(x -> x % 2 == 0).toList()
        );
        List<String> words = List.of("apple", "banana", "cherry", "date");
        System.out.println(
                words.stream().map(String::toUpperCase).toList()
        );
        List<String> words2 = List.of("cat", "elephant", "dog", "giraffe", "bee");
        System.out.println(
                words2.stream().filter(s -> s.length() > 5).count()
        );
    }
}
