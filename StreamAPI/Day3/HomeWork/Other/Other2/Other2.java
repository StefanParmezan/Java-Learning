package StreamAPI.Day3.HomeWork.Other.Other2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Other2 {
    public static void main(String[] args){
        List<String> names = List.of("Anton", "Dima", "Misha", "Artem", "Bob", "Zig", "Calm", "Andrey", "Abba");
        System.out.println(
                names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toMap(s -> s, String::length))
        );
        String replace = names.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(
                "grouped list: " + names.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).collect(Collectors.groupingBy(String::length)) +
                "\nmax length word:  " + names.stream().max(Comparator.comparingInt(String::length)).get() +
                "\nsymbols count: " + names.stream().filter(s -> !s.equals(replace)).mapToInt(String::length).sum() +
                "\nhave words < 5: " + names.stream().allMatch(s -> s.length() < 5) +
                "\nto string: " + names.stream().collect(Collectors.joining(", "))
        );
    }
}

