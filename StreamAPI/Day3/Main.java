package StreamAPI.Day3;

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
    }
}
