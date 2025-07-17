package StreamAPI.DayBonus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayBonus {
    public static void main(String[] args) {
        List<List<String>> dayBonusList = new ArrayList<>();
        dayBonusList.add(List.of("Java", "C#", "Python", "C++", "Ruby", "JavaScript"));
        dayBonusList.add(List.of("Apple", "Banana", "Orange"));
        List<List<Integer>> listlistnums = new ArrayList<>();
        listlistnums.add(Arrays.asList(1, 2, 3, 4, 5));
        listlistnums.add(Arrays.asList(6, 7, 8, 9, 10));
        listlistnums.add(Arrays.asList(16, 77, 48, 29, 130));
        listlistnums.add(Arrays.asList(16, 79, 678, 129, 130));
        listlistnums.add(Arrays.asList(1612, 757, 418, 5684, 100));
        System.out.println(dayBonusList.stream().flatMap(List::stream).collect(Collectors.joining(", ")));
        System.out.println(dayBonusList.stream().flatMap(List::stream).mapToInt(String::length).sum());
        System.out.println(listlistnums.parallelStream().flatMap(List::stream).reduce(0, Integer::sum));
    }
}
