package StreamAPI.Day2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class WorkingWithList {
    public List<String> filterByValue(List<String> input, String value){
        return input.stream().filter(s -> s.startsWith(value)).toList();
    }

    public List<String> toUpperList(List<String> input){
        return input.stream()
                .map(s -> s.toUpperCase())
                .toList();
    }

    public List<String> removeDuplicates(List<String> input){
        return input.stream().distinct().toList();
    }

    public List<String> toStupidList(List<String> input){
        return IntStream.range(0, input.size())
                .mapToObj(i -> i % 2 == 0 ? input.get(i).toUpperCase() : input.get(i).toLowerCase())
                .toList();
    }

    public List<String> sortByAlphabet(List<String> input){
        return input.stream().filter(s -> s.matches("^\\D+$")).sorted().toList();
    }

    public List<Integer> sortByInteger(List<String> input){
        return input.stream().filter(s -> s.matches("\\d+")).map(Integer::parseInt).toList();
    }
 }
