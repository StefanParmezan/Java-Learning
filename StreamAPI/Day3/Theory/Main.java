package StreamAPI.Day3.Theory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Watermelon");
        list.add("Pineapple");
        System.out.println(WorkingWithNewMethods.getInstance().cutList(list, 3));
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(WorkingWithNewMethods.getInstance().findAnyValue(list2));
    }
}
