package StreamAPI.Day3;

import java.util.List;

public class WorkingWithNewMethods {
    private static WorkingWithNewMethods instance = new WorkingWithNewMethods();
    private WorkingWithNewMethods() {}

    public List<String> cutList(List<String> input, int count){
        return input.stream().limit(count).toList();
    }

    public Integer findRandom(List<Integer> input){return input.stream().findAny().get();}

    public static WorkingWithNewMethods getInstance() {
        return instance;
    }
}
