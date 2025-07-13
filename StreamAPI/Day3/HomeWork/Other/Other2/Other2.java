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
    }
}

