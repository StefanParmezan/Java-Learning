package StreamAPI.Day4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    static void main(String[] args){
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list.stream().filter(s -> s % 2 == 0).mapToInt(Integer::intValue).sum());

        Set<Integer> result = Stream.iterate(1, i -> i + 1)
                        .limit(20)
                        .filter(s -> s % 3 == 0)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result);
        List<String> stringlist = List.of("Apple", "Juice", "Orange", "Anton", "Arable", "A A A A A A A", "Acaba", "Obama");
        System.out.println(stringlist.stream().filter(s -> s.startsWith("A")).collect(Collectors.joining(" | ")));
        System.out.println(stringlist.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.groupingBy(s -> s.startsWith("O"))));
        Map<String, Boolean> licenseusers = Map.of("Anton", true, "Dima", false, "Misha", true, "Artem", false);
        Map<Boolean, List<Map.Entry<String, Boolean>>> allusers = licenseusers.entrySet().stream().collect(Collectors.partitioningBy(s -> s.getValue().equals(false)));
        System.out.println(allusers);
        //Map<String, Boolean> bannedusers = allusers.entrySet().stream().filter(s -> s.getValue().equals(true)).collect(Collectors.toMap(s -> s.getValue().stream().collect(Collectors.), Map.Entry::getKey));
    }
}
